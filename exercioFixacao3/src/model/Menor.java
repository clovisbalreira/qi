package model;

public class Menor {
    //2) Faça um programa que peça para o usuário inserir 3 números e que verifique qual é o menor ou se eles são iguais.
    //atributos
    private double numero1;
    private double numero2;
    private double numero3;

    //metodos acessores

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public double getNumero3() {
        return numero3;
    }

    public void setNumero3(double numero3) {
        this.numero3 = numero3;
    }

    //metodo
    @Override
    public String toString() {
        String mensagem = "";
        if(getNumero1() == getNumero2() && getNumero1() == getNumero3()){
            mensagem = "Os três valores são iguais.\nO menor valor é: " + getNumero1();
        }else if(getNumero1() == getNumero2() && getNumero1() != getNumero3()){
            mensagem = "O primeiro valor e o segundo valor são iguais.";
            if(getNumero1() < getNumero3()){
                mensagem += "\nOs valores 1 e 2 são os menores: " + getNumero1();
            }else{
                mensagem += "\nO valor 3 é menor: " + getNumero3();
            }
        }else if(getNumero1() == getNumero3() && getNumero1() != getNumero2()){
            mensagem = "O primeiro valor e o terceiro valor são iguais.";
            if(getNumero1() < getNumero2()){
                mensagem += "\nOs valores 1 e 3 são os menores: " + getNumero1();
            }else{
                mensagem += "\nO valor 2 é menor: " + getNumero2();
            }
        }else if(getNumero2() == getNumero3() && getNumero1() != getNumero2()){
            mensagem = "O segundo valor e o terceiro valor são iguais.";
            if(getNumero2() < getNumero1()){
                mensagem += "\nO valores 2 e 3 são os menores: " + getNumero2();
            }else{
                mensagem += "\nO valor 1 é menor: " + getNumero1();
            }
        }else{
            mensagem = "Os três valores são diferentes.";
            if(getNumero1() < getNumero2() && getNumero1() < getNumero3()){
                mensagem += "\nO valor 1 é menor: " + getNumero1();
            }else if(getNumero2() < getNumero1() && getNumero2() < getNumero3()){
                mensagem += "\nO valor 2 é menor: " + getNumero2();
            }else{
                mensagem += "\nO valor 3 é menor: " + getNumero3();
            }
        }
        return mensagem;
    }
}
