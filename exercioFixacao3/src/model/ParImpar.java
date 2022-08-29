package model;

public class ParImpar {
    //3) Faça um programa que receba um número qualquer e verifique este número é par ou ímpar e, também, positivo ou negativo.
    //atributo
    private int numero;

    //metodo acessorios

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    //metodos
    public String imparPar(){
        if(this.getNumero() % 2 == 0){
            return  "par ";
        }else {
            return "impar ";
        }
    }

    public String positivoNegativo(){
        if(this.getNumero() < 0){
            return "e negativo.";
        }else{
            return "e positivo.";
        }
    }

    //toString
    @Override
    public String toString() {
        return  "O número " + this.getNumero() + " é " + this.imparPar() + this.positivoNegativo() ;
    }
}
