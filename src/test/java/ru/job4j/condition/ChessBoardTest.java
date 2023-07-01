package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class ChessBoardTest {

    @Test
    public void wayIs5() {
        int x1 = 6;
        int y1 = 7;
        int x2 = 1;
        int y2 = 2;
        int result = ChessBoard.way(x1, y1, x2, y2);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void wayIs2() {
        int x1 = 4;
        int y1 = 3;
        int x2 = 2;
        int y2 = 5;
        int result = ChessBoard.way(x1, y1, x2, y2);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenX1Y1areMinus1ThenWayIs0() {
        int x1 = -1;
        int y1 = -1;
        int x2 = 3;
        int y2 = 3;
        int result = ChessBoard.way(x1, y1, x2, y2);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void wayIs0() {
        int x1 = 2;
        int y1 = 5;
        int x2 = 2;
        int y2 = 5;
        int result = ChessBoard.way(x1, y1, x2, y2);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }
}
