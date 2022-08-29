package views;

import model.Age;
import model.Square;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Square square = new Square();
        Age age = new Age();


        System.out.println("Digite seu nome: ");
        age.name = ler.nextLine();
        System.out.println("Digite o ano de nascimento: ");
        age.yearBirth = ler.nextInt();
        System.out.println(age);

        System.out.println("Digite o lado do quadrado: ");
        square.number = ler.nextDouble();
        System.out.println(square);
    }
}
