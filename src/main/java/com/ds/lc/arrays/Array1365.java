package com.ds.lc.arrays;

import java.util.LinkedHashMap;
import java.util.Map;

public class Array1365 {
    //Link: https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/

    /*
      Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it.
      That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
     */
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        Map<Integer, Integer> freq = new LinkedHashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (!freq.containsKey(num)) {
                freq.put(num, 0);
                for (int j = 0; j < nums.length; j++) {
                    if (num > nums[j])
                        freq.put(num, freq.get(num) + 1);
                }
            }
        }

        int[] newA = new int[nums.length];
        int i = 0;
        for (int j : nums) {
            newA[i++] = freq.get(j);
        }
        return newA;
    }

    public static int[] smallerNumbersThanCurrent2(int[] nums) {
        int[] counter = new int[101];
        for (int i = 0; i < nums.length; i++) {
            counter[nums[i]]++;
        }

        int acc = counter[0];
        counter[0] = 0;
        for (int j = 1; j < 101; j++) {
            int freq = counter[j];
            counter[j] = acc;
            acc = acc + freq;
        }

        for (int i = 0; i < nums.length; i++)
            nums[i] = counter[nums[i]];
        return nums;

    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,2,2,2,2,2,3,6, 5, 4, 8, 7, 7, 7, 7};
        for (int i : smallerNumbersThanCurrent2(nums)) {
            System.out.println(i);
        }
    }
}
