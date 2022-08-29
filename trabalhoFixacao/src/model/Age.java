package model;

import java.sql.Time;
import java.util.Calendar;
import java.util.Date;

public class Age {
    //3) Algoritmo que receba o nome da pessoa, ano nascimento e
    // ano atual e calcule e mostre a idade da pessoa.

    public String name;
    public int yearBirth;
    public int currentYear = 2021;

    public int calcAge(){
        return currentYear - yearBirth;
    }

    @Override
    public String toString() {
        return name + " nasceu no ano " + yearBirth + " tem " + calcAge() + " anos.";
    }
}
