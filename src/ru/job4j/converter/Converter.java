package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value){
        int rsl = value/70;
        return rsl;
    }
    public static int rubleToDolar (int value) {
        int rsl = value/60;
        return rsl;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(210);
        System.out.println("210 rub= " + euro + " euro");
        int dollar = Converter.rubleToDolar(120);
        System.out.println("120 rub = " + dollar +" dollar");

    }
}
