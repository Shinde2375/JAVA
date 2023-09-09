package com.tka.prac.prog14.HW;

import java.util.Scanner;

public class KnightMoves {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the current position of the knight (e.g., a1, c3, h8): ");
        String currentPosition = scanner.nextLine();

        int row = 8 - Integer.parseInt(currentPosition.substring(1, 2));
        int col = (int) (currentPosition.charAt(0) - 'a');

        int[][] possibleMoves = {
            {2, 1}, {1, 2}, {-1, 2}, {-2, 1},
            {-2, -1}, {-1, -2}, {1, -2}, {2, -1}
        };

        System.out.println("Possible knight moves from " + currentPosition + ":");

        for (int[] move : possibleMoves) {
            int newRow = row + move[0];
            int newCol = col + move[1];

            if (isValidPosition(newRow, newCol)) {
                String newPosition = "" + (char) ('a' + newCol) + (8 - newRow);
                System.out.println(newPosition);
            }
        }
    }

    private static boolean isValidPosition(int row, int col) {
        return row >= 0 && row < 8 && col >= 0 && col < 8;
    }
}

