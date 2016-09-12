package com.app.Impl;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Vitaly on 12.09.16.
 */
public class HalfCompareTest {
    String palindrome = "А роза упала на лапу Азора";
    String notPalindrome = "А роза упала на лапу";

    @Test
    public void isPalindrome() throws Exception {
        HalfCompare halfCompare = new HalfCompare();

        boolean isPalindrome = halfCompare.isPalindrome(this.palindrome);
        assertEquals(isPalindrome, true);

        boolean isNotPalindrome = halfCompare.isPalindrome(this.notPalindrome);
        assertEquals(isNotPalindrome, false);
    }

}