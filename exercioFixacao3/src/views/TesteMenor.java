package views;

import model.Menor;

import java.util.Scanner;

public class TesteMenor {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Menor menor = new Menor();
        System.out.println("Digite o primeiro Número: ");
        menor.setNumero1(ler.nextByte());
        System.out.println("Digite o segundo Número: ");
        menor.setNumero2(ler.nextByte());
        System.out.println("Digite o terceiro Número: ");
        menor.setNumero3(ler.nextByte());
        System.out.println(menor);
    }
}
