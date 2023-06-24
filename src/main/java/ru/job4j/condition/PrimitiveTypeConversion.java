package ru.job4j.condition;

public class PrimitiveTypeConversion {
    public static void main(String[] args) {
        long l = 129;
        byte b = (byte) l;
        System.out.println(b);
        float f = 12358.7f;
        int i = 45981;
        short rsl = (short) (f + i);
        System.out.println(rsl);
        char c = 45000;
        float i1 = c;
        System.out.println(i1);
        double d = 121.19;
        byte b1 = (byte) d;
        System.out.println(b1);
        short s = 1500;
        char c1 = (char) s;
        double d1 = c1;
        System.out.println(c1);
        System.out.println(d1);
    }
}
