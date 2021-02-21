package br.com.abc.javacore.Fmodificadorestatico.test;

import br.com.abc.javacore.Fmodificadorestatico.classe.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 280);
        Carro c2 = new Carro("AUDI", 275);
        Carro c3 = new Carro("MERCEDES", 240);

        c1.imprime();
        c2.imprime();
        c3.imprime();

        System.out.println("++++++++++++++++");

        Carro.velocidadeLimite=220;


        c1.imprime();
        c2.imprime();
        c3.imprime();

    }


}
