package model;

public class Square {
    //1) Efetuar a leitura de um número inteiro e apresentar o resultado do quadrado desse número.
    public double number;
    public double squareCalc(){
        return Math.pow(number,2);
    }

    //2) Faça um algoritmo que calcule a área de um quadrado de lado L= 10.
    public double calcSquareArea(){
        return Math.pow(10,2);
    }

    @Override
    public String toString() {
        return "O número quadrado de " + number + " é " + squareCalc() + ".\nA área quadrado de 10 é " + calcSquareArea() ;
    }
}
