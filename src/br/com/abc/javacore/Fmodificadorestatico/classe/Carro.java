package br.com.abc.javacore.Fmodificadorestatico.classe;

public class Carro {
        //velocidade limite: 240km/h
    private String nome;
    private double velocidadeMaxima;
    public static double velocidadeLimite;

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public Carro() {

    }

    public void imprime() {
        System.out.println("---------------------");
        System.out.println("Modelo: " + this.nome);
        System.out.println("Velocidade Maxima: " + this.velocidadeMaxima);
        System.out.println("Velocidade Limite: " +velocidadeLimite);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

}