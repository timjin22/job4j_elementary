package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        int[] data = new int[] {5, 10, 3};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenArrayHasNot10ThenMinus1() {
        int[] data = new int[] {5, 10, 3};
        int el = 9;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenArrayHas19Then7() {
        int[] data = new int[] {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37};
        int el = 19;
        int result = FindLoop.indexOf(data, el);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }
}
