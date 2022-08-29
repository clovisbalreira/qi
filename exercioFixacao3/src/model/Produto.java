package model;

public class Produto {
//4) Faça um programa que receba o preço de um produto, e o n° de parcelas desejado. O programa deverá seguir a tabela abaixo e informar o valor total
// a pagar, e o valor de cada parcela.
// Obs: o valor mínimo para parcelar é de R$ 50,00. Caso o valor seja menor que R$ 50,00, mostrar uma mensagem dizendo que não é possível parcelar.
// Obs: Os juros deverão ser multiplicados pelo número de parcelas.Até 3 1% De 4 a 6 2% Acima de 6 3%
    //atributo
    private double preco;
    private int parcela;

    //metodo acessores
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getParcela() {
        return parcela;
    }

    public void setParcela(int parcela) {
        this.parcela = parcela;
    }

    //metodos
    public double valorParcela(){
        return this.getPreco() / this.getParcela();
    }

    public String possivelParcelar(){
        if(this.valorParcela() < 50){
            return "Não é possivel parcelar esse valor\nO pagamento tem que ser a vista" ;
        }else{
            return "O valores das parcelas ficara R$: " + this.valorParcelasPorcetagem();
        }
    }

    public double valorParcelasPorcetagem(){
        if(this.getParcela() <= 3){
            return this.valorParcela() + (this.valorParcela() * 0.01);
        }else if(this.getParcela() <= 6){
            return this.valorParcela() + (this.valorParcela() * 0.02);
        }else{
            return this.valorParcela() + (this.valorParcela() * 0.03);
        }
    }

    //toString
    @Override
    public String toString() {
        if(this.getParcela() < 2){
            return "O produto custa R$ " + this.getPreco() +
                    "\nO pagamento será a vista";
        }else{
            return "O produto custa R$ " + this.getPreco() +
                    " dividido em " + this.getParcela() + " parcela(s) de R$: " +
                    this.valorParcelasPorcetagem()
                    ;
        }
    }
}
