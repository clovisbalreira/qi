package model;

public class Conta {
    //5)  Faça um programa que imprima na tela o valor da conta de água a partir da leitura de
    //consumo do mês anterior e do atual conforme marcado no hidrômetro. Sabe-se que a conta de
    //água é formada pela tarifa de água, somada a tarifa de esgoto (2,5% da conta de água) e a
    //tarifa de conservação do hidrômetro (R$5,00). O consumo de água é de acordo com a tabela
    //abaixo:
    //0  --   10 m³  --------------------> R$ 0,69 m³
    //11-- 15 m³ ---------------------> R$ 1,17 m³
    //16-- 25 m³-------------------------> R$ 1,48 m³
    //Acima de 25m³ -------------->  R$ 1,60 m³

    //atributo
    private double consumo;
    private double hidrometro = 5;

    //metodos acessores

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public double getHidrometro() {
        return hidrometro;
    }

    public void setHidrometro(double hidrometro) {
        this.hidrometro = hidrometro;
    }

    //metodo
    public double calculoTarifaAgua(){
        if(this.getConsumo() <= 10){
            return this.getConsumo() * 0.69;
        }else if(this.getConsumo() <= 15){
            return this.getConsumo() * 1.17;
        }else if(this.getConsumo() <= 25){
            return this.getConsumo() *1.48;
        }else{
            return this.getConsumo() * 1.60;
        }
    }

    public double calculoEsgotoAgua(){
        return this.calculoTarifaAgua() * 0.025;
    }

    public double calculoContaTotal(){
        return this.calculoEsgotoAgua() + this.calculoTarifaAgua() + this.getHidrometro();
    }

    //toString

    @Override
    public String toString() {
        return "---Conta---" +
                "\nValor Tarifa Agua R$: " + this.calculoTarifaAgua() +
                "\nValor Tarifa Esgoto R$: " + this.calculoEsgotoAgua() +
                "\nValor do Hidrômetro R$: " + this.getHidrometro() +
                "\nValor Total R$: " + this.calculoContaTotal()
                ;
    }
}
