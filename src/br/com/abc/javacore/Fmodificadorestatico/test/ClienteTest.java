package br.com.abc.javacore.Fmodificadorestatico.test;


import br.com.abc.javacore.Fmodificadorestatico.classe.Cliente;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente c= new Cliente();

        System.out.println("Dentro do ClientTest");
        for(int parcela:c.getParcelas()){
            System.out.print(parcela+" ");

        }



    }
}
