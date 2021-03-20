package ru.job4j.calculator;

public class Fit {

    public static double manWeight (short height){
        return (height-100)*1.15;
    }
    public static double woomanWeight (short height){
        return (height-110)*1.15;
    }

    public static void main(String[] args) {
        short height = 174;
        double man = Fit.manWeight(height);
        System.out.println("Man 174 is " + man);
        height = 168;
        double wooman = Fit.woomanWeight(height);
        System.out.println("Man 168 is " + wooman);
    }


}
