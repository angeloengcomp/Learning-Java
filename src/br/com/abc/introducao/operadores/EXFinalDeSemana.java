package br.com.abc.introducao.operadores;

public class EXFinalDeSemana {
    public static void main(String[] args) {
        byte dia = 1;
        switch (dia) {
            case 1:
            case 6:
            case 7:
                System.out.println("Final de Semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Dia Util");
                break;
            default:
                System.out.println("Opção inválida");
                break;

        }

    }
}
