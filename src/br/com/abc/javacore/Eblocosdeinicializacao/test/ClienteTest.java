package br.com.abc.javacore.Eblocosdeinicializacao.test;

import br.com.abc.javacore.Eblocosdeinicializacao.classe.Cliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente c= new Cliente();

        System.out.println("Dentro do ClientTest");
        for(int parcela:c.getParcelas()){
            System.out.print(parcela+" ");

        }



    }
}
