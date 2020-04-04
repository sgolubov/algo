package ua.com.golubov.algo.leetcode.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sudoku {

    private static final Set<Character> allowedNumbers = new HashSet<>() {
        {
            add('1');
            add('2');
            add('3');
            add('4');
            add('5');
            add('6');
            add('7');
            add('8');
            add('9');
        }
    };

    public boolean isValidSudoku(char[][] board) {
        // initialize sets for row, boxes, columns
        List<Set<Character>> rowSets = new ArrayList<>();
        List<Set<Character>> boxesSets = new ArrayList<>();
        List<Set<Character>> columnsSets = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            rowSets.add(new HashSet<>());
            boxesSets.add(new HashSet<>());
            columnsSets.add(new HashSet<>());
        }

        // iterate over the array and do the logic on sets
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char numberToCheck = board[i][j];
                if (numberToCheck == '.')
                    continue;
                if (!allowedNumbers.contains(numberToCheck)) {
                    return false;
                }
                if (rowSets.get(i).contains(numberToCheck)) {
                    return false;
                }
                rowSets.get(i).add(numberToCheck);
                if (columnsSets.get(j).contains(numberToCheck)) {
                    return false;
                }
                columnsSets.get(j).add(numberToCheck);
                int boxesIdx = getBoxesIndex(i, j);
                if (boxesSets.get(boxesIdx).contains(numberToCheck)) {
                    return false;
                }
                boxesSets.get(boxesIdx).add(numberToCheck);
            }
        }

        return true;
    }

    private int getBoxesIndex(int i, int j) {
        if (i < 3) {
            if (j < 3) {
                return 0;
            } else if (j < 6) {
                return 1;
            } else {
                return 2;
            }
        } else if (i < 6) {
            if (j < 3) {
                return 3;
            } else if (j < 6) {
                return 4;
            } else {
                return 5;
            }
        } else {
            if (j < 3) {
                return 6;
            } else if (j < 6) {
                return 7;
            } else {
                return 8;
            }
        }
    }

}
