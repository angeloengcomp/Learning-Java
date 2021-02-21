package br.com.abc.javacore.Dsobrecargaconstrutores.test;

import br.com.abc.javacore.Dsobrecargaconstrutores.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante=new Estudante("Carlos","154449995", new double[]{8,5.8,4},"5551085");
        estudante.print();

    }


}
