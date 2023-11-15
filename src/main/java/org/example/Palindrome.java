package org.example;

public class Palindrome {
    public static boolean isPalindrome(String word) {
        if (word.length() < 3) {
            return false;
        }

        String lowercaseWord = word.toLowerCase();

        return lowercaseWord.equals(new StringBuilder(lowercaseWord).reverse().toString());
    }
}
