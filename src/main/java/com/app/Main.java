package com.app;

/**
 * Created by Vitaly on 12.09.16.
 */
public class Main {

    public static void main(String[] args) {
        String inputString = "А роза упала на лапу Азора";

        HalfCompare halfCompare = new HalfCompare();
        System.out.println(halfCompare.isPalindrome(inputString));

        RevertAndCompare revertAndCompare = new RevertAndCompare();
        System.out.println(revertAndCompare.isPalindrome(inputString));
    }
}
