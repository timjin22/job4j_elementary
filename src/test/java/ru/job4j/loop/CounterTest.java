package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromTwoToEightThenTwenty() {
        int start = 2;
        int finish = 8;
        int result = Counter.sumByEven(start, finish);
        int expected = 20;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenSumEvenNumbersFromMinusEightToFourThenMinusFourteen() {
        int start = -8;
        int finish = 4;
        int result = Counter.sumByEven(start, finish);
        int expected = -14;
        assertThat(result).isEqualTo(expected);
    }
}
