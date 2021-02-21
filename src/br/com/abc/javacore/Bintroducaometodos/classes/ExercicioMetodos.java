package br.com.abc.javacore.Bintroducaometodos.classes;

public class ExercicioMetodos {
    private String nome;
    private int idade;
    private double[] notas;
    private boolean aprovado;

    public void print() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        for (double nota : this.notas) {
            System.out.print(nota + " ");
        }

    }

    public void TirarMedia() {
        double soma = 0;
        for (double nota : this.notas) {
            soma += nota;
        }
        double media = soma / this.notas.length;
        System.out.println("\nMedia: " + media);
        if (media > 6) {
            System.out.println("Aluno Aprovado");
        } else {
            System.out.println("Aluno Reprovado");
        }
    }

    // getters e setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public double[] notas() {
        return this.notas;
    }

    public boolean isAprovado() {
        return this.aprovado;
    }


}
