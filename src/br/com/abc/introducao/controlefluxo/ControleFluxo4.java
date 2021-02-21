package br.com.abc.introducao.controlefluxo;

public class ControleFluxo4 {
    public static void main(String[] args) {
        // WHILE PARA IMPRIMIR SOMENTE OS NÚMEROS IMPARES DE 1 A 100.
        /*int contador=0;
        while(contador<=100){
            if(contador%2==1){
                System.out.println(contador);
            }
            contador++;

        }*/
        // FOR PARA IMPRIMIR SOMENTE OS NÚMEROS IMPARES DE 1 A 100.
        for(int i=1;i<101;i++){
            if(i%2==1){
                System.out.println(i);
            }
        }
    }
}
