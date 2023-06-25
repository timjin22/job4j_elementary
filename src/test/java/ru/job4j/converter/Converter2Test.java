package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;

public class Converter2Test {

    @Test
    public void whenConvert140RblThen2Euro() {
        float in = 140;
        float expected = 2;
        float out = Converter2.rubleToEuro(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }

    @Test
    public void whenConvert420RblThen7Dollar() {
        float in = 420;
        float expected = 7;
        float out = Converter2.rubleToDollar(in);
        float eps = 0.0001f;
        Assert.assertEquals(expected, out, eps);
    }
}