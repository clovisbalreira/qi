package views;

import model.Salario;

import java.util.Scanner;

public class SalarioTeste {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o salário minimo R$: ");
        double salarioMinimo = ler.nextDouble();
        System.out.println("Digite o salário do funcionário R$: ");
        double salarioFuncionario = ler.nextDouble();
        Salario salario = new Salario(salarioMinimo,salarioFuncionario);
        System.out.println(salario);
    }
}
