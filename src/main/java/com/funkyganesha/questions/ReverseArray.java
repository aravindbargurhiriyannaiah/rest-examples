package com.funkyganesha.questions;

/**
 * Created by barga009 on 8/18/14 at 6:30 PM. Comment {"$EXPR$"}
 */
public class ReverseArray {

    /**
     * Given a character array containing only letters and spaces, write a function to transpose the "words" in the array. For example, ['H', 'i', ' ', 'W', 'o', 'r', 'l', 'd'] will become ['W', 'o', 'r', 'l', 'd', ' ', 'H', 'i']. A "word" is defined as contiguous letters bounded by the ends of the array, or 1 or more spaces. Your function should return a character array or void, and the result should have the same length as the input. Consider edge cases, such as all letters, leading and trailing spaces, etc.
     * <p/>
     * short-hand examples:
     * [Hi World]       ->  [World Hi]
     * [one two three ] ->  [ three two one]
     * [   ]            ->  [   ]
     * [trip      advisor boston] -> [boston advisor      trip]
     * [ a;lskdjfalksjfd;lkasdjf;lkasdjf;lkasjdf;lkasjdf;laksjdfkl;as.......]
     * [as;ldkfja;lsdkfja;lskjdfa;lskdfj owuierpoiwauerpoiquwerpowqiuerpoiqwuerpoqwiuerpoqwiuerpoqweurpoqweriupoiq...]
     *
     * Complexity = O(2n)
     */

    public char[] reverseCharArray(char[] input) {
        char[] output = null;
        if (input != null) {
            output = new char[input.length];
            int spaceIndex = input.length;
            int number = 0;
            for (int i = input.length - 1; i >= 0; i--) {
                if (input[i] == ' ') {
                    int start = i + 1;
                    while (start < spaceIndex) {
                        output[number++] = input[start++];
                    }
                    output[number++] = ' ';
                    spaceIndex = i;
                }
            }
            if (spaceIndex != 0) {
                for (int i = 0; i < spaceIndex; i++) {
                    output[number++] = input[i];
                }
            }
        }
        return output;
    }
}
