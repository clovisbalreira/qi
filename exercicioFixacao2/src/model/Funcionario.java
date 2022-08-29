package model;

public class Funcionario {
    //Uma determinada empresa paga a seus funcionários um salário de R$ 200,00. Esta empresa
    //determinou que será dado um aumento de 20% para todos os funcionários. Calcule o salário
    //reajustado dos funcionários.

    //atributos
    private double salario;
    private double aumentoPorcento;

    //contrutor

    public Funcionario(double salario, double aumentoPorcento) {
        this.salario = salario;
        this.aumentoPorcento = aumentoPorcento;
    }

    //metodos acessores
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getAumentoPorcento() {
        return aumentoPorcento;
    }

    public void setAumentoPorcento(double aumentoPorcento) {
        this.aumentoPorcento = aumentoPorcento;
    }

    //metodo
    public double reajustarSalario(){
        return this.getSalario() + (this.getSalario() * (this.getAumentoPorcento() / 100));
    }

    //toString

    @Override
    public String toString() {
        return "O salário atual é " + this.getSalario() + " com o rajuste de " + this.getAumentoPorcento() + "% o salário será R$: " + this.reajustarSalario();
    }
}
