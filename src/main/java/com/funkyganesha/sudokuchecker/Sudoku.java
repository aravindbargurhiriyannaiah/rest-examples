package com.funkyganesha.sudokuchecker;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * Created by barga009 on 8/11/14 at 9:32 PM. Comment {"$EXPR$"}
 */
public class Sudoku {
    List<Integer> numbers;

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }

    @Override
    public String toString() {
        int size = numbers.size();
        double sqrtOfSize = Math.sqrt(size);
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < size) {
            for (int j = 0; j < sqrtOfSize; j++) {
                sb.append(numbers.get(i + j)).append("\t");
            }
            sb.append("\n");
            i = i + 9;
        }
        return new StringBuilder().append("Sudoku \n{\n").append(sb.toString()).append("\n}").toString();
    }

    public static void main(String args[]) {
        Sudoku sudoku = new Sudoku();
        List<Integer> nums = Lists.newArrayList();
        for (int i = 1; i < 82; i++) {
            nums.add(i);
        }
        sudoku.setNumbers(nums);
        System.out.println((sudoku.toString()));
    }
}
