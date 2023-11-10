import org.example.MoveZeroes;
import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class MoveZeroesTest {


    @Test
    public void moveZeroesWithZeroes() {
        int[] numsInput = {0, 1, 0, 3, 12};
        int[] numsResult = {1, 3, 12, 0, 0};
        MoveZeroes.moveZeroes(numsInput);
        assertTrue(Arrays.equals(numsInput, numsResult));
    }

    @Test
    public void moveZeroesWithoutZeroes() {
        int[] numsInput = {5, 3, 12};
        int[] numsResult = {5, 3, 12};
        MoveZeroes.moveZeroes(numsInput);
        assertTrue(Arrays.equals(numsInput, numsResult));
    }
}
