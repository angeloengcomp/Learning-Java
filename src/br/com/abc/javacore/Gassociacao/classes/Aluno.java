package br.com.abc.javacore.Gassociacao.classes;

public class Aluno {
    private String nome;
    private int idade;
    private Seminario seminario;


    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public Aluno() {

    }

    public void print() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        if (this.seminario!= null)
            System.out.println("Seminario: " + this.seminario.getTitulo());
        else
            System.out.println("Aluno não está incristo em nenhum seminário.");

    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }

    public Seminario getSeminario() {
        return seminario;
    }


    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }


}
