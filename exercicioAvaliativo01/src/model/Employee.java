package model;

public class Employee {
    //2) Um funcionário recebe um salário fixo mais 4% de comissão sobre as vendas.
    // Faça um programa que receba o salário fixo de um funcionário e o valor de suas vendas,
    // calcule e mostre a comissão e o salário final do funcionário. (Criar com GET e SET)

    //atributo
    private String name;
    private double salary;
    private double sale;

    //getters e setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSale() {
        return sale;
    }

    public void setSale(double sale) {
        this.sale = sale;
    }

    //metodo
    public double saleCommission(){
        return this.getSale() * 0.04;
    }

    public double TotalSalary(){
        return this.getSalary() + this.saleCommission();
    }

    //toString


    @Override
    public String toString() {
        return "O funcionario " + this.getName() +
                "\nRecebe o salario de R$ " + this.getSalary() +
                "\nSomando com a comissão de R$ " + this.saleCommission() +
                "\nO salário total do " + this.getName() + " será R$ " + this.TotalSalary();
    }
}
