package com.kepler51.ds.numbers;

public class PrimeNumber {

    private static boolean isPrimeNumber(int num) {
        if(num == 2 || num == 3 || num == 5 || num == 7)
            return true;

        int start;

        for (start = 2; start < num ; start++) {
            if ( num%start == 0)
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrimeNumber(37));
    }
}
