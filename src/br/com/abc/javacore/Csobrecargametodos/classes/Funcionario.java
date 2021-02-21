package br.com.abc.javacore.Csobrecargametodos.classes;

public class Funcionario {
    private String nome;
    private String cpf;
    private double salario;

    public Funcionario(String nome, String cpf, double salario){
        this.nome=nome;
        this.cpf=cpf;
        this.salario=salario;
    }

    public Funcionario(){

    }

    public void init(String nome, String cpf, double salario){
        this.nome=nome;
        this.cpf=cpf;
        this.salario=salario;

    }

    public void imprime() {
        System.out.println(this.getSalario());
        System.out.println(this.getCpf());
        System.out.println(this.getNome());
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public double getSalario() {
        return this.salario;
    }
}
