package views;

import model.Conta;

import java.util.Scanner;

public class TesteConta {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Conta conta = new Conta();

        System.out.println("Digite O valor o consumo do hidrômetro: ");
        conta.setConsumo(ler.nextDouble());
        System.out.println(conta);
    }
}
