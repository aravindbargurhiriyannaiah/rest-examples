package com.funkyganesha.sudokuchecker;

import com.google.common.collect.Lists;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by barga009 on 8/11/14 at 10:22 PM. Comment {"$EXPR$"}
 */
public class SudokuValidatorTest {
    private List<Integer> numbers = Lists.newArrayList();

    @Before
    public void beforeEachTestCase() {
        numbers.clear();
    }

    @Test
    public void testInvalidNumberInSolution() {
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(10);
        assertFalse("This solution has the correct number of numbers (4 is a perfect square), but has a number in it (10) that is greater than the sqrt of the size, result should be false",
                SudokuValidator.isSudokuComplete(numbers));
    }

    @Test
    public void testIncorrectNumberOfNumbersInSolution() {
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        assertFalse("This should be false because 3 is not a perfect square", SudokuValidator.isSudokuComplete(numbers));
    }

    @Test
    public void testSolutionDoesNotHaveValidNumbersInColumn() {
        numbers.add(1);
        numbers.add(2);
        numbers.add(1);
        numbers.add(2);
        assertFalse("This solution has both columns invalid.", SudokuValidator.isSudokuComplete(numbers));
    }

    @Test
    public void testSolutionDoesNotHaveValidNumbersInRow() {
        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        assertFalse("This solution has both rows invalid.", SudokuValidator.isSudokuComplete(numbers));

    }

    @Test
    public void testCornerCases() throws Exception {
        assertFalse(SudokuValidator.isSudokuComplete(null));
        assertFalse(SudokuValidator.isSudokuComplete(Lists.<Integer>newArrayList()));
    }

    @Test
    public void testValidSolution() {
        numbers.add(4);
        numbers.add(7);
        numbers.add(8);
        numbers.add(1);
        numbers.add(6);
        numbers.add(3);
        numbers.add(2);
        numbers.add(5);
        numbers.add(9);
        numbers.add(6);
        numbers.add(2);
        numbers.add(9);
        numbers.add(5);
        numbers.add(8);
        numbers.add(4);
        numbers.add(7);
        numbers.add(3);
        numbers.add(1);
        numbers.add(3);
        numbers.add(5);
        numbers.add(1);
        numbers.add(9);
        numbers.add(7);
        numbers.add(2);
        numbers.add(8);
        numbers.add(6);
        numbers.add(4);
        numbers.add(8);
        numbers.add(6);
        numbers.add(7);
        numbers.add(3);
        numbers.add(9);
        numbers.add(1);
        numbers.add(4);
        numbers.add(2);
        numbers.add(5);
        numbers.add(1);
        numbers.add(3);
        numbers.add(5);
        numbers.add(2);
        numbers.add(4);
        numbers.add(8);
        numbers.add(9);
        numbers.add(7);
        numbers.add(6);
        numbers.add(9);
        numbers.add(4);
        numbers.add(2);
        numbers.add(6);
        numbers.add(5);
        numbers.add(7);
        numbers.add(3);
        numbers.add(1);
        numbers.add(8);
        numbers.add(7);
        numbers.add(1);
        numbers.add(4);
        numbers.add(8);
        numbers.add(3);
        numbers.add(5);
        numbers.add(6);
        numbers.add(9);
        numbers.add(2);
        numbers.add(5);
        numbers.add(9);
        numbers.add(3);
        numbers.add(4);
        numbers.add(2);
        numbers.add(6);
        numbers.add(1);
        numbers.add(8);
        numbers.add(7);
        numbers.add(2);
        numbers.add(8);
        numbers.add(6);
        numbers.add(7);
        numbers.add(1);
        numbers.add(9);
        numbers.add(5);
        numbers.add(4);
        numbers.add(3);
        assertTrue("This is a valid solution. result should be true.", SudokuValidator.isSudokuComplete(numbers));
    }
}
