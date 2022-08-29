package views;

import model.Employee;

import java.util.Scanner;

public class TestEmployee {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Employee e = new Employee();
        System.out.println("Digite o nome do funcionário: ");
        e.setName(ler.nextLine());
        System.out.println("Digite o valor do salário: ");
        e.setSalary(ler.nextDouble());
        System.out.println("Digite o valor das vendas: ");
        e.setSale(ler.nextDouble());
        System.out.println(e.toString());
    }
}
