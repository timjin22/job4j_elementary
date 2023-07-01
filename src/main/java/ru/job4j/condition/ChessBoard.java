package ru.job4j.condition;

public class ChessBoard {
    private static boolean isValid(int coordinate) {
        return coordinate >= 0 && coordinate <= 7;
    }

    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;
        if (isValid(x1) && isValid(x2)
                && isValid(y1) && isValid(y2)) {
            if (Math.abs(x2 - x1) == Math.abs(y2 - y1)) {
                rsl = Math.abs(x2 - x1);
            }
        }
        return rsl;
    }

    public static void main(String[] args) {
        int cells = ChessBoard.way(0, 0, 4, 4);
        System.out.println("Number of cells bishop moved: " + cells);
        cells = ChessBoard.way(1, 1, 5, 6);
        System.out.println("Number of cells bishop moved: " + cells);
    }
}
