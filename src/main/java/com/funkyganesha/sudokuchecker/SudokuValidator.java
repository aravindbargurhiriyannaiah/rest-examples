package com.funkyganesha.sudokuchecker;

import com.google.common.collect.Lists;
import org.springframework.util.CollectionUtils;

import java.util.Collections;
import java.util.List;

/**
 * Created by barga009 on 8/11/14 at 10:12 PM. Comment {"$EXPR$"}
 */
public class SudokuValidator {
    public static boolean isSudokuComplete(List<Integer> numbers) {
        boolean isValid = isSudokuSolutionAcceptable(numbers);
        if (isValid) {
            //eg. For a 9 x 9 sudoku solution, the following should be true
            //each row must have have one occurrence of 1 - 9
            //each column must have one occurrence of 1 - 9
            //each cube block should have all the numbers 1 - 9

            int sqrt = (int) Math.sqrt(numbers.size());
            int sqrtSqrt = (int) Math.sqrt(sqrt);

            List<Integer> row = Lists.newArrayList();
            //each row must have have one occurrence of 1 - 9
            for (int i = 0; i < numbers.size(); ) {
                row.add(numbers.get(i++));
                if (row.size() == sqrt) {
                    if (isListValid(row)) {
                        row.clear();
                    } else {
                        isValid = false;
                        break;
                    }
                }
            }
            if (isValid) {
                //each column must have one occurrence of 1 - 9
                List<Integer> column = Lists.newArrayList();
                int index = 0;
                int i = index;
                while (index < sqrt) {
                    column.add(numbers.get(i));
                    if (column.size() == sqrt) {
                        if (isListValid(column)) {
                            column.clear();
                            i = ++index;
                        } else {
                            isValid = false;
                            break;
                        }
                    } else {
                        i += sqrt;
                    }
                }
            }

            //each cube block should have all the numbers 1 - 9
//            if (isValid) {
//                List<Integer> cube = Lists.newArrayList();
////                123 456 789
////                101112 131415 161718
////                192021 222324 252627
//                int index = 0;
//                int i = index;
//                for (; ; ) {
//                    cube.add(numbers.get(i));
//                    if (cube.size() == sqrt) {
//                        if (isListValid(cube)) {
//                            cube.clear();
//                            i = index + 3;
//                        } else {
//                            isValid = false;
//                            break;
//                        }
//                    } else {
//                        i++;
//                    }
//
//                }
//            }
        }
        return isValid;
    }

    private static boolean isListValid(List<Integer> list) {
        boolean isValid = true;
        Collections.sort(list);
        for (int j = 1; j <= list.size(); j++) {
            if (j != list.get(j - 1)) {
                isValid = false;
                break;
            }
        }
        return isValid;
    }

    private static boolean isSudokuSolutionAcceptable(List<Integer> numbers) {
        boolean result = false;
        if (!CollectionUtils.isEmpty(numbers)) {
            int sqrt = (int) Math.sqrt(numbers.size());
            int sqrtSize = (int) (Math.sqrt(numbers.size()) + 0.5);
            //The number of numbers in the solution should be a perfect square.
            if (((sqrtSize * sqrtSize) == numbers.size())) {
                for (Integer number : numbers) {
                    //all the numbers in the solution should be 1<= number <= sqrt (the number of numbers in the solution)
                    if (number < 0 || number > sqrt) {
                        result = false;
                        break;
                    } else {
                        result = true;
                    }
                }
            }
        }
        return result;
    }
}
