package org.example;

import static org.example.Palindrome.isPalindrome;

public class App
{
    public static void main(String[] args) {
        String string1 = "Radar";
        String string2 = "hello";
        String string3 = "level";
        String sentence = "This is a sentence that has madam, ryanair, mouse in it";

        System.out.println("Is \"" + string1 + "\" a palindrome? " + isPalindrome(string1));
        System.out.println("Is \"" + string2 + "\" a palindrome? " + isPalindrome(string2));
        System.out.println("Is \"" + string3 + "\" a palindrome? " + isPalindrome(string3));

        String[] words = sentence.split("\\s|,\\s");
        String longestPalindrome = findLongestPalindrome(words);

        System.out.println("Longest palindrome in the sentence: " + longestPalindrome);
    }

    public static String findLongestPalindrome(String[] palindromeArray){
        String result = "";

        for (int i=0; i<palindromeArray.length-1; i++){

            if (isPalindrome(palindromeArray[i])){

                result = palindromeArray[i];

            }
        }

        return result;
    }

}
