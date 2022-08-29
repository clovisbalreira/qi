package model;

public class Time {
    // 3) Faça um algoritmo que leia um valor inteiro equivalente a um
    // determinado valor em segundos. Retorne quantas horas, minutos e
    // segundos são compostos por este valor. Por exemplo o valor 3670
    // (segundos) formaria 1 hora, 1 minuto e 10 segundos.

    //atributos
    private int segunds;

    //getters e setters

    public int getSegunds() {
        return segunds;
    }

    public void setSegunds(int segunds) {
        this.segunds = segunds;
    }

    //metodos
    public int calcTime(){
        return this.getSegunds() / 3600 ;
    }

    public int calcMinutes(){
        return (this.getSegunds() % 3600) / 60;
    }

    public int calcSegunds(){
        return this.segunds - (3600 * this.calcTime()) - (60 * calcMinutes()) ;
    }
    //toString
    @Override
    public String toString() {
        return segunds + " segundo(s) forma " + calcTime() + " hora(s), " + calcMinutes()
                + " minuto(s) e " + calcSegunds() + " segundo(s).";
    }
}
