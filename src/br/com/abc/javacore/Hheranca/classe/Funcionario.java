package br.com.abc.javacore.Hheranca.classe;

public class Funcionario extends Pessoa {
    private double salario;


    public void print() {
        super.print();
        System.out.println("Salario: " + this.salario);
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }


}
