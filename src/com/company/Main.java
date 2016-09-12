package com.company;

import java.util.Scanner;

public class Main implements Palindrome {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        Main main = new Main();

        System.out.println(main.isPalindrome(string));
    }

    @Override
    public boolean isPalindrome(String s) {
        String string = s.replaceAll("[^A-Za-z1-9]+", "").toLowerCase();
        StringBuilder reverse = new StringBuilder(string.toLowerCase()).reverse();

        return reverse.toString().equals(string);
    }
}
