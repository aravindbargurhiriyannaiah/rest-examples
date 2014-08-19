package com.funkyganesha.questions;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/**
 * Created by barga009 on 8/18/14 at 6:33 PM. Comment {"$EXPR$"}
 */
public class ReverseArrayTest {
    private ReverseArray reverseArray;

    @Before
    public void beforeEachTestCase() {
        reverseArray = new ReverseArray();
    }

    @Test
    public void testReverseCharArray() throws Exception {
        char[] input = null;
        char[] output = reverseArray.reverseCharArray(input);
        assertNull("Invalid returned result. Should be null", output);

        input = new char[8];
        input[0] = 'h';
        input[1] = 'i';
        input[2] = ' ';
        input[3] = 'w';
        input[4] = 'o';
        input[5] = 'r';
        input[6] = 'l';
        input[7] = 'd';

        output = reverseArray.reverseCharArray(input);
        assertEquals("Invalid ouput size", 8, output.length);
        assertEquals("Invalid character found", 'w', output[0]);
        assertEquals("Invalid character found", 'o', output[1]);
        assertEquals("Invalid character found", 'r', output[2]);
        assertEquals("Invalid character found", 'l', output[3]);
        assertEquals("Invalid character found", 'd', output[4]);
        assertEquals("Invalid character found", ' ', output[5]);
        assertEquals("Invalid character found", 'h', output[6]);
        assertEquals("Invalid character found", 'i', output[7]);

        input = new char[10];
        input[0] = ' ';
        input[1] = 'h';
        input[2] = 'i';
        input[3] = ' ';
        input[4] = 'w';
        input[5] = 'o';
        input[6] = 'r';
        input[7] = 'l';
        input[8] = 'd';
        input[9] = ' ';

        output = reverseArray.reverseCharArray(input);
        assertEquals("Invalid ouput size", 10, output.length);
        assertEquals("Invalid character found", ' ', output[0]);
        assertEquals("Invalid character found", 'w', output[1]);
        assertEquals("Invalid character found", 'o', output[2]);
        assertEquals("Invalid character found", 'r', output[3]);
        assertEquals("Invalid character found", 'l', output[4]);
        assertEquals("Invalid character found", 'd', output[5]);
        assertEquals("Invalid character found", ' ', output[6]);
        assertEquals("Invalid character found", 'h', output[7]);
        assertEquals("Invalid character found", 'i', output[8]);
        assertEquals("Invalid character found", ' ', output[9]);
    }
}
