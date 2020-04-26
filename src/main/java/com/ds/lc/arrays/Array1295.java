package com.ds.lc.arrays;

public class Array1295 {
    //PD : 1295. Find Numbers with Even Number of Digits

    /*
    Given an array nums of integers, return how many of them contain an even number of digits.
     */
    public static int findNumbers(int[] nums) {
        int evenDigitCount = 0;
        for (int i : nums) {
            if ((String.valueOf(i)).length() % 2 == 0)
                evenDigitCount++;
        }
        return evenDigitCount;
    }

    public static int findNumbers2(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; ++i) {
            if ((nums[i] > 9 && nums[i] < 100) || (nums[i] > 999 && nums[i] < 10000)) {
                ++count;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {555, 901, 482, 1234};
        int res = findNumbers(nums);
        System.out.println(res);
    }
}
