package views;

import model.ParImpar;

import java.util.Scanner;

public class TesteParImpar {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ParImpar parImpar = new ParImpar();
        System.out.println("Digite o número: ");
        parImpar.setNumero(ler.nextInt());
        System.out.println(parImpar);
    }
}
