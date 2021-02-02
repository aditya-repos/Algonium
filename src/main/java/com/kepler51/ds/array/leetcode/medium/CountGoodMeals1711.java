package com.kepler51.ds.array.leetcode.medium;

public class CountGoodMeals1711 {

    public static int countPairs(int[] deliciousness) {
        int toal = 0;
        for (int i = 0; i <= deliciousness.length-1; i++) {
            for (int j = i + 1; j < deliciousness.length ; j++) {
                    int sumOfDeliciousness = deliciousness[i] + deliciousness[j];
                    boolean resul = isPowerOfTwo2(sumOfDeliciousness);
                    if(resul) {
                        toal++;
                    }
            }
        }
        return toal;
    }

    private static boolean isPowerOfTwo(int num){
        //Base condition
        if(num == 1)
            return true;
        if(num % 2 != 0 || num == 0)
            return false;
        return isPowerOfTwo(num/2);
    }

    private static boolean isPowerOfTwo2(int num){
        //Base condition
        if(num == 1)
            return true;
        if(num == 0)
            return false;
        while (num != 1){
            if(num % 2 != 0)
                return false;
            num = num / 2;
        }
        return true;
    }

    public static void main(String[] args) {
        int [] nums = {};
        int res = countPairs(nums);
        System.out.println(res);
    }
}