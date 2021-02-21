package br.com.abc.introducao.operadores;

public class OperadoresAtribuicao {
    public static void main(String[] args) {
        //psvm public sta...
        //sout system.ou....
        int salario=1800;
        salario+=1000; //========== salario=salario+1000;
        System.out.println(salario);
        salario-=1000;
        System.out.println(salario);
        salario*=0.1;
        System.out.println(salario);
        salario=1000;
        salario+=(int)(salario*0.1); // ========== salario= salario+(int)(salario*0.1);
        System.out.println(salario);

    }
}
