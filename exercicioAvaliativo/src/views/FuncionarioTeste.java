package views;

import model.Funcionario;

import java.util.Scanner;

public class FuncionarioTeste {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Funcionario f1 = new Funcionario();
        System.out.println("Digite o nome do funcionário:");
        f1.setNome(ler.nextLine());
        System.out.println("Digite o CPF do funcionário:");
        f1.setCpf(ler.nextLine());
        System.out.println("Digite o cargo do funcionário:");
        f1.setCargo(ler.nextLine());
        System.out.println("Digite o valor horas trabalhadas R$:");
        f1.setValorHora(ler.nextInt());
        System.out.println("Digite a quantidade de horas trabalhadas :");
        f1.setQuantidadeHoras(ler.nextInt());
        System.out.println("Digite o tipo de insalubridade:" +
                "\n1 – Sem Insalubridade" +
                "\n2 – Mínimo" +
                "\n3 – Médio" +
                "\n4 – Máximo");
        f1.setTipoInsalubridade(ler.nextInt());
        System.out.println("Digite o número de dependentes do funcionário:");
        f1.setDependentes(ler.nextInt());
        int opcao;
        do {    System.out.println("=======================");
            System.out.println("Digite a opção do menu: \n" +
                "1 – Consultar Dados do Funcionário\n" +
                "2 – Ver salário Bruto\n" +
                "3 - Ver Salário Família\n" +
                "4 - Ver Vale Transporte\n" +
                "5 – Ver Insalubridade\n" +
                "6 – Ver INSS\n" +
                "7 – Ver Salário Final");

            opcao = ler.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("DADOS DO FUNCIONARIO : \n" + f1);
                    break;
                case 2:
                    System.out.println("Salário bruto R$ " + f1.calcularSalarioBruto());
                    break;
                case 3:
                    System.out.println("Salário familia R$ " + f1.calcularSalarioFamilia());
                    break;
                case 4:
                    System.out.println("Vale transporte R$ " + f1.calcularValeTransporte());
                    break;
                case 5:
                    System.out.println("Insalubridade R$ " + f1.calcularInsalubridade());
                    break;
                case 6:
                    System.out.println("INSS R$ " + f1.calcularInss());
                    break;
                case 7:
                    System.out.println("Salário Liquido R$ " + f1.calcularSalarioLiquido());
                    break;
                default:
                    System.out.println("Opção invalida");
                    break;
            }
        }while(opcao < 8);
    }
}
