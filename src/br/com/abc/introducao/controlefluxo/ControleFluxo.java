package br.com.abc.introducao.controlefluxo;

public class ControleFluxo {
    public static void main(String[] args) {
        int idade=20&22;
        float salario=2000;

        int x=11;

        if(idade>=18){
            System.out.println("Entrou no Clube.");
        }
        if(x==10){
            System.out.println("x é igual 10");
        }else if(x==11){
            System.out.println("X é igual a 11");
        }else{
            System.out.println("X é diferente de 11 e 10");
        }

    }
}
