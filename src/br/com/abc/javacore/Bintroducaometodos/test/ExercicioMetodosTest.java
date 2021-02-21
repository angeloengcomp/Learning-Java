package br.com.abc.javacore.Bintroducaometodos.test;

import br.com.abc.javacore.Bintroducaometodos.classes.ExercicioMetodos;

public class ExercicioMetodosTest {
    public static void main(String[] args) {
        ExercicioMetodos aluno = new ExercicioMetodos();
        aluno.setNome("Angelo Ricardo");
        aluno.setIdade(24);
        aluno.setNotas(new double[]{8,5,8.5});
        aluno.print();
        aluno.TirarMedia();
        System.out.println(aluno.getIdade());
        System.out.println(aluno.getNome());
        System.out.println("Estudante: "+aluno.isAprovado());


    }
}
