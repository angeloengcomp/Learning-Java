package br.com.abc.javacore.Fmodificadorestatico.classe;

public class Cliente {
    private static int[] parcelas;

    {
        parcelas = new int[100];
        System.out.println("Dentro do Bloco de inicialização");
        for(int i=1;i<=100;i++){
        parcelas[i-1]=i;
    }

    }

    public Cliente() {
    }


    public int[] getParcelas() {
        return parcelas;
    }

    public void setParcelas(int[] parcelas) {
        Cliente.parcelas = parcelas;
    }
}
