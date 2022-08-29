package model;

public class Maior10 {
    // Crie uma Classe Operacao que receba dois valores.
    // Calcule uma soma entre os valores e verifique se a Soma é maior que 10.

    //atributos
    private double valor1;
    private double valor2;
    private double total;

    //metodos acessores
    public double getValor1() {
        return valor1;
    }

    public void setValor1(double valor1) {
        this.valor1 = valor1;
    }

    public double getValor2() {
        return valor2;
    }

    public void setValor2(double valor2) {
        this.valor2 = valor2;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    //metodos
    @Override
    public String toString() {
        this.setTotal(this.getValor1() + this.getValor2());
        if(this.getTotal() > 10.0){
            return "O valor total é maior que 10";
        }else if(this.getTotal() == 10.0){
            return "O valor total é igual a 10";
        }else{
            return "O valor total é menor que 10";
        }
    }
}
