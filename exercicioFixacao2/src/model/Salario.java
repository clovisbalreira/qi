package model;

public class Salario {
    //Faça um programa que receba o valor do salário-mínimo e o valor do salário de um funcionário, calcule e
    // mostre a quantidade de salários-mínimos que ganha esse funcionário.

    //atributos
    private double salarioMinimo;
    private double salario;

    //construtor

    public Salario(double salarioMinimo, double salario) {
        this.salarioMinimo = salarioMinimo;
        this.salario = salario;
    }

    //metodo acessores

    public double getSalarioMinimo() {
        return salarioMinimo;
    }

    public void setSalarioMinimo(double salarioMinimo) {
        this.salarioMinimo = salarioMinimo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    //metodo
    public double quantidadeSalario(){
        return this.getSalario() / this.getSalarioMinimo();
    }

    //toString
    @Override
    public String toString() {
        return "O salário minimo é R$: " + this.getSalarioMinimo() +
                " o salário do funcionário é R$: " + this.getSalario() +
                " o funcionário recebe " + this.quantidadeSalario() +" salário minimo";
    }
}
