package views;

import model.Maior10;

import java.util.Scanner;

public class TesteMaior10 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Maior10 maior10 = new Maior10();
        System.out.println("Digite o primeiro valor");
        maior10.setValor1(ler.nextDouble());
        System.out.println("Digite o segundo valor");
        maior10.setValor2(ler.nextDouble());
        System.out.println(maior10);
    }
}
