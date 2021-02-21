package br.com.abc.javacore.Bintroducaometodos.test;

import br.com.abc.javacore.Bintroducaometodos.classes.Professor2;

public class ProfessorTest2 {
    public static void main(String[] args) {
        Professor2 prof = new Professor2();
        prof.cpf = "881.818.545.18";
        prof.rg = "75454";
        prof.nome = "Joao das Neves";

        Professor2 prof2 = new Professor2();
        prof2.cpf = "881.818.545.18";
        prof2.rg = "75454";
        prof2.nome = "Aegon Tagaleryan";

        prof.imprime(prof);
        prof.imprime(prof2);
    }

}
