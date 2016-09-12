package com.app.Impl;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Vitaly on 12.09.16.
 */
public class RevertAndCompareTest {
    String palindrome = "А роза упала на лапу Азора";
    String notPalindrome = "А роза упала на лапу";

    @Test
    public void isPalindrome() throws Exception {
        RevertAndCompare revertAndCompare = new RevertAndCompare();

        boolean isPalindrome = revertAndCompare.isPalindrome(this.palindrome);
        assertEquals(isPalindrome, true);

        boolean isNotPalindrome = revertAndCompare.isPalindrome(this.notPalindrome);
        assertEquals(isNotPalindrome, false);
    }

}