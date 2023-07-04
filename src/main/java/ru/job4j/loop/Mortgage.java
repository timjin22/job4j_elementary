package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 1;
        double debt = amount + amount * (percent / 100);
        while (debt - salary > 0) {
            debt -= salary;
            year++;
        }
        return year;
    }
}
