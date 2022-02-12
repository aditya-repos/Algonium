package com.kepler51.ds.string.leetcode;

public class ReplaceAllDigitswithCharacters1844 {
    public static String replaceDigits(String s) {
        StringBuilder build = new StringBuilder(s);

        for (int i  = 1; i < s.length(); i=i+2) {
            int j = Character.getNumericValue(s.charAt(i));
            char c = (char) (s.charAt(i -1) + j);
            build.replace(i, i+1, ""+c);
        }

        return build.toString();
    }

    public static String replaceDigits2(String s) {
        StringBuilder build = new StringBuilder("");

        for (int i  = 1; i < s.length(); i=i+2) {
            int j = Character.getNumericValue(s.charAt(i));
            char c = (char) (s.charAt(i -1) + j);
            build.replace(i, i+1, ""+c);
        }

        return build.toString();
    }

    public static void main(String[] args) {
        System.out.println(replaceDigits("a1b2c3d4e"));
    }
}
