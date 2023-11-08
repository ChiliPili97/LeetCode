import org.example.MatrixDiagSum;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MatrixDiagSumTest {

    int[][] matrix3x3 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
    };

    int[][] matrix4x4 = {
            {1, 2, 3, 5},
            {4, 5, 6, 5},
            {7, 8, 9, 5},
            {10, 11, 12, 5}
    };

    @Test
    public void whenMatrixNotEven() {
        assertEquals(MatrixDiagSum.diagonalSum(matrix3x3), 25);
    }

    @Test
    public void whenMatrixEven() {
        assertEquals(MatrixDiagSum.diagonalSum(matrix4x4), 49);
    }
}
