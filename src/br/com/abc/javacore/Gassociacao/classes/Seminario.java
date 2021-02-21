package br.com.abc.javacore.Gassociacao.classes;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Professor professor;
    private Local local;

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Seminario(String titulo){
        this.titulo=titulo;
    }

    public Seminario(){

    }

    public void print(){
        System.out.println("Titulo: "+this.titulo);
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public void setAlunos(Aluno[] alunos){
        this.alunos=alunos;
    }

    public Aluno[] getAlunos(){
        return alunos;
    }



    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public String getTitulo(){
        return titulo;
    }



}
