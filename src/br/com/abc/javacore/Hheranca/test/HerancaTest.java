package br.com.abc.javacore.Hheranca.test;

import br.com.abc.javacore.Hheranca.classe.Endereco;
import br.com.abc.javacore.Hheranca.classe.Funcionario;
import br.com.abc.javacore.Hheranca.classe.Pessoa;

public class HerancaTest {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        Endereco endereco = new Endereco();


        p.setNome("Gina");
        p.setCpf("5548447819");


        endereco.setBairro("Anhanguera");
        endereco.setRua("Rua 25");

        p.setEndereco(endereco);

        p.print();

        System.out.println("----------------------");


        Funcionario f = new Funcionario();
        f.setSalario(2500);
        f.setCpf("51514863");
        f.setEndereco(endereco);
        f.setNome("Goku");

        f.print();

    }
}
