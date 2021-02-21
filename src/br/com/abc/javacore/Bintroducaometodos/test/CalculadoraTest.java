package br.com.abc.javacore.Bintroducaometodos.test;

import br.com.abc.javacore.Bintroducaometodos.classes.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
//        calc.somaDoisNumeros();
//        calc.subtraiDoisNumeros();
//        calc.multiplicaDoisNumeros(5, 4);
//        System.out.println(calc.divideDoisNumeros(20, 2));
//        //or
//        double result = calc.divideDoisNumeros(20, 2);
//        System.out.println(result);
//        System.out.println("Fim do programa");
//        calc.imprimeDoisNumerosDivididos(20, 0);
        int[] sequencia={1,2,3,4,5};
        calc.somaArray(sequencia);
        calc.somaVarArray(1,2,3,4,5);

    }


}
