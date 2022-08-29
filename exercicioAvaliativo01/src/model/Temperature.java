package model;

public class Temperature {
    //1) Ler uma temperatura em graus Celsius e transformá-la em
    // graus Fahrenheit. Fórmula: F = (9*C+160)/5
    public double celsius;

    public double calcFahrenheit(){
        return ( 9 * celsius + 160 ) / 5;
    }

    @Override
    public String toString() {
        return celsius +"° celsius é equivalente a " + calcFahrenheit() + "° fahrenheit.";
    }
}
