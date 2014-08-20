package com.funkyganesha.questions;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by barga009 on 8/19/14 at 6:15 PM. Comment {"$EXPR$"}
 */
public class PalindromeTest {
    private Palindrome palindrome;

    @Before
    public void beforeEachTestCase() {
        palindrome = new Palindrome();
    }

    @Test
    public void testIsPalindrome() throws Exception {
        assertFalse(palindrome.isPalindrome(null));
        assertFalse(palindrome.isPalindrome(""));
        assertTrue("abba is a palindrome, result should be true", palindrome.isPalindrome("abba"));
        assertTrue("liril is palindrome, result should be true", palindrome.isPalindrome("liril"));
        assertFalse("aravind is not palindrome, result should be false", palindrome.isPalindrome("aravind"));
    }
}
