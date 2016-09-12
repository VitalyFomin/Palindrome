package com.app;

/**
 * Created by vitaliy on 12.09.16.
 */
@FunctionalInterface
public interface Palindrome {
    /**
     * Проверка входной строки на палиндром.
     * @param s входная строка
     * @return true - палиндром
     *         false - не палиндром
     */
    boolean isPalindrome(String s);
}
