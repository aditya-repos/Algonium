package com.kepler51.ds.string.basic;

public class Reverse {

    private static void printReverse(final String input) {
        for(char c : input.toCharArray())
            System.out.println(c);

        for (int i = input.length() - 1; i >= 0; i--) {
            System.out.println(input.charAt(i));
        }
    }

    public static void main(String[] args) {
        printReverse("Aditya Gaurav");
    }
}
