package com.kepler51.ds.string.leetcode;

import java.util.Locale;

public class DetermineIfStringHalvesAreAlike1704 {

    //Worst 7.07%
    public static boolean halvesAreAlike(String s) {

        int vowelCount1 = 0;


        int mid = (s.length() / 2) ;

        s = s.toLowerCase();

        for (int i = 0, j = mid; i < mid && j < s.length(); i++,j++) {

            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                vowelCount1++;
            }
            if (s.charAt(j) == 'a' || s.charAt(j) == 'e' || s.charAt(j) == 'i' || s.charAt(j) == 'o' || s.charAt(j) == 'u') {
                vowelCount1--;
            }
        }
        return vowelCount1 == 0;
    }

    public boolean halvesAreAlike2(String s) {
        char[] carr = s.toCharArray();
        int count1 = 0, count2 = 0, half = s.length() / 2;
        for (int i = 0; i < half; i++) {
            if (isVowel(carr[i])) count1++;
            if (isVowel(carr[i+half])) count2++;
        }
        return count1 == count2;
    }
    public static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

    public static void main(String[] args) {
        System.out.println(halvesAreAlike("book"));
    }
}
