package org.example;

public class MatrixDiagSum {
    public static int diagonalSum(int[][] mat) {
        int result = 0;
        //calculate primary diagonal
        for (int i = 0; i < mat.length; ) {
            for (int j = 0; j < mat[0].length; ) {
                int value = mat[i][j];
                i++;
                j++;
                result += value;
            }
        }

        //calculate secondary diagonal
        int j = mat.length - 1;
        for (int i = 0; i < mat.length; ) {
            int value = mat[i][j];
            i++;
            j--;
            if (!isEvenMatrix(mat) && getMiddle(mat) == i) {
                continue;
            }
            result += value;

        }
        return result;
    }

    private static int getMiddle(int[][] mat) {
        return (mat.length / 2) + 1;
    }

    private static boolean isEvenMatrix(int[][] mat) {
        return mat.length % 2 == 0;
    }
}
