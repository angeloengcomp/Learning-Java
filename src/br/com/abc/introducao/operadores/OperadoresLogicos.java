package br.com.abc.introducao.operadores;

public class OperadoresLogicos {
    public static void main(String[] args){
        // && and, || or
        int idade=18;
        float salario=1000f;

        System.out.println(idade>=18 && salario>=1000);
        System.out.println(idade>=20 && salario>=1000);

        System.out.println(idade>=18 || salario>=1000);
        System.out.println(idade>=20 || salario>=1000);
    }
}
