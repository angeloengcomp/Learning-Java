package br.com.abc.javacore.Dsobrecargaconstrutores.classes;

public class Estudante {
    private String nome;
    private String matricula;
    private double[] notas;
    private String rg;

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Estudante(String nome, String matricula, double[] notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = notas;
    }

    public void print() {
        System.out.println(this.nome);
        System.out.println(this.matricula);
        for (double nota : notas) {
            System.out.println(nota + " ");
        }
    }

    public Estudante(String nome, String matricula, double[] notas, String rg){
        this(nome,matricula,notas);
        this.rg=rg;

    }

    public Estudante(){
        System.out.println("Estudante Default");
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }
}
