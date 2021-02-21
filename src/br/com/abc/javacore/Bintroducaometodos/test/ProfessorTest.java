package br.com.abc.javacore.Bintroducaometodos.test;

import br.com.abc.javacore.Bintroducaometodos.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.cpf = "222.541.845.23";
        prof.matricula = "54515151";
        prof.nome = "Joao das Neves";
        prof.rg = "565115";

        Professor prof2 = new Professor();

        prof2.cpf = "222.541.845.23";
        prof2.matricula = "54515151";
        prof2.nome = "Joao das Neves";
        prof2.rg = "565115";

        prof.imprime();
        prof2.imprime();
    }
}
