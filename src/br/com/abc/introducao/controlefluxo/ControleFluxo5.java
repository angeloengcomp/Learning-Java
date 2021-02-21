package br.com.abc.introducao.controlefluxo;

public class ControleFluxo5 {
    public static void main(String[] args) {
        // dado o valor de um carro, descubra em quantas vzs ele pode ser parcelado,
        // porem as parcelas nao podem ser <1000
    double valorTotal=30000;
    for(int parcela=1;parcela<=30000;parcela++){
        double valorParcela=valorTotal/parcela;
        if(valorParcela>=1000){
            System.out.println(parcela+"X de R$"+valorParcela);
        }
    }
    }
}
