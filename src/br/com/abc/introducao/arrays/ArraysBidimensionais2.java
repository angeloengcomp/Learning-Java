package br.com.abc.introducao.arrays;

public class ArraysBidimensionais2 {
    public static void main(String[] args) {
        int[][] dias={{0,0},{1,2,3},{0,0,0,0}};


//        int[][] dias=new int[3][];
//        dias[0]=new int[2]; //variaveis não iniciadas são iniciadas com "0" automaticamente, ou seja, 0,0 neste caso
//        dias[1]=new int[]{1,2,3};
//        dias[2]=new int[4];
//        for(int i=0;i<dias.length;i++){
//            for(int j=0;j<dias[i].length;j++){
//                System.out.println(dias[i][j]);
//            }
//        }
        for (int[] ref : dias) {
            for (int aux : ref) {
                System.out.println(aux);
            }
        }

    }
}
