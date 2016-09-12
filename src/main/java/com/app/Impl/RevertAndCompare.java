package com.app.Impl;

import com.app.Palindrome;

public class RevertAndCompare implements Palindrome {

    /**
     * Сравнение перевернутой строки с исходной строкой.
     * @param s входная строка
     * @return
     */
    @Override
    public boolean isPalindrome(String s) {
        String string = s.replaceAll(" ", "").toLowerCase();
        StringBuilder reverse = new StringBuilder(string.toLowerCase()).reverse();

        return reverse.toString().equals(string);
    }
}
