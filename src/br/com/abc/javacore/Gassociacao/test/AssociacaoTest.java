package br.com.abc.javacore.Gassociacao.test;

import br.com.abc.javacore.Gassociacao.classes.Aluno;
import br.com.abc.javacore.Gassociacao.classes.Local;
import br.com.abc.javacore.Gassociacao.classes.Professor;
import br.com.abc.javacore.Gassociacao.classes.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Angelo Ricardo", 24);
        Aluno aluno2=new Aluno("Joao das neves",16);
        Seminario sem = new Seminario("Como ser programador");
        Professor professor = new Professor("Yoda", "Como usar a força para programar");
        Local local = new Local("Rua das Araras", "Floresta");

        sem.setAlunos(new Aluno[]{aluno,aluno2});
        sem.setLocal(local);
        sem.setProfessor(professor);

        professor.setSeminarios(new Seminario[]{sem});

        aluno.setSeminario(sem);
        aluno2.setSeminario(sem);

        aluno.print();
        aluno2.print();


    }
}
