package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(150);
        System.out.println("150 rubles are " + euro + " euros");
        float dollar = Converter.rubleToDollar(420);
        System.out.println("420 rubles are " + dollar + " dollars");
    }
}
