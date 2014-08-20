package com.funkyganesha.questions;

public class Palindrome {
    //Check if a given string is a palindrome or not
    public boolean isPalindrome(String str) {
        boolean result = ((str != null) && (str.length() > 0));
        if (result) {
            char[] arr = str.toCharArray();
            int i = 0;
            int j = arr.length - 1;
            while (i <= j) {
                if (arr[i++] != arr[j--]) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
