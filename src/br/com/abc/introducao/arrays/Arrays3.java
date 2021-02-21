package br.com.abc.introducao.arrays;

public class Arrays3 {
    public static void main(String[] args) {
        int[] numeros= new int[3];
        int[] numeros2={1,2,3,4,5};
        int[] numeros3=new int[]{1,2,3,4,5};

//        for(int i=0;i<numeros3.length;i++){
//            System.out.println(numeros3[i]);
//        }

        //foreach // a variavel aux precisa ser do mesmo tipo do array
        for(int aux:numeros3){
            System.out.println(aux);
        }


    }

}

