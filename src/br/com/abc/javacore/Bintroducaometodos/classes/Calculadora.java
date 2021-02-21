package br.com.abc.javacore.Bintroducaometodos.classes;

public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println(5 + 5);
    }

    public void subtraiDoisNumeros() {
        System.out.println(6 - 1);
    }

    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        }
        return 0;
    }

    public void imprimeDoisNumerosDivididos(double num1, double num2) {
        if (num2 != 0) {
            System.out.println(num1 / num2);
            return;//funciona como um break;, esse return, só pode ser usado em metodos do tipo void
        }
        System.out.println("Não é possível dividir por 0");


    }

    public void alteraDoisNumeros(int num1, int num2) {
        num1 = 20;
        num2 = 30;
        System.out.println("Dentro do alteraDoisNumeros-----------");
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);

    }

    public void somaArray(int[] numeros) {
        int soma = 0;
        for (int aux : numeros) {
            soma += aux;
        }
        System.out.println(soma);
    }
    public void somaVarArray(int... numeros) {
        int soma = 0;
        for (int aux : numeros) {
            soma += aux;
        }
        System.out.println(soma);
    }
}
