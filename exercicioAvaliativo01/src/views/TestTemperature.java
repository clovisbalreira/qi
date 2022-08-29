package views;

import model.Temperature;

import java.util.Scanner;

public class TestTemperature {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Temperature t = new Temperature();
        System.out.println("Digite os graus celsius: ");
        t.celsius = ler.nextDouble();
        System.out.println(t.toString());
    }
}
