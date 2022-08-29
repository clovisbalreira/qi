package views;

import model.Produto;

import java.util.Scanner;

public class TesteProduto {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Produto produto = new Produto();
        System.out.println("Digite o valor do produto R$: ");
        produto.setPreco(ler.nextDouble());
        System.out.println("Digite o valor de parcelas: ");
        produto.setParcela(ler.nextInt());
        System.out.println(produto);
    }
}
