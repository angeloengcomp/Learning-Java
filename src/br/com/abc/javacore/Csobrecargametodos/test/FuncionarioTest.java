package br.com.abc.javacore.Csobrecargametodos.test;

import br.com.abc.javacore.Csobrecargametodos.classes.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Carlos", "010101", 2000);
        Funcionario funcionario1 = new Funcionario();
        funcionario1.init("Joao", "05051635", 2500);

        //  funcionario.init("João", "2154545449", 4500);
        funcionario.imprime();
        funcionario1.imprime();


    }
}
