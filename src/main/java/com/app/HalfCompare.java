package com.app;

/**
 * Created by Vitaly on 12.09.16.
 */
public class HalfCompare implements Palindrome {

    /**
     * Сравнение первой половины строки со второй половиной с конца.
     * @param s входная строка
     * @return
     */
    @Override
    public boolean isPalindrome(String s) {
        String s1 = s.replaceAll(" ", "").toLowerCase();
        char[] charArray = s1.toCharArray();

        for (int i = 0; i < charArray.length / 2; i++) {
            if (charArray[i] != charArray[charArray.length - i - 1])
                return false;
        }

        return true;
    }
}
