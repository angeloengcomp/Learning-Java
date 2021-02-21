package br.com.abc.javacore.Aintroducaoclasses.test;

import br.com.abc.javacore.Aintroducaoclasses.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor= new Professor();
        Professor professor1= new Professor();

        professor.nome="Marcelo Kun";
        professor.matricula="9494488200";
        professor.cpf=293226662;
        professor.rg=84846;

        professor1.nome="Marcelo Kunsd";
        professor1.matricula="9494488200sd";
        professor1.cpf=29366621;
        professor1.rg=848461;

        //professor=professor1;

        System.out.println("CPF: " +
                ""+professor.cpf);
        System.out.println("NOME DO PROFESSOR: "+professor.nome);
        System.out.println("MATRICULA: "+professor.matricula);
        System.out.println("RG: "+professor.rg);

        System.out.println("---------------------------");

        System.out.println("CPF: "+professor1.cpf);
        System.out.println("NOME DO PROFESSOR: "+professor1.nome);
        System.out.println("MATRICULA: "+professor1.matricula);
        System.out.println("RG: "+professor1.rg);

    }




}
