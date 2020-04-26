package com.ds.lc.arrays;

import java.util.Arrays;

public class DecompressArray1313 {
    //Leetcode Problem :
    public static int[] decompressRLElist(int[] nums) {
        int sizeOfDecompressedArray = 0;
        int[] decompressedArray;
        for (int i = 0; i < nums.length; i = i + 2)
            sizeOfDecompressedArray += nums[i];
        decompressedArray = new int[sizeOfDecompressedArray];

        int j = 0;
        for (int i = 0; i < nums.length; i = i + 2) {
            int k = nums[i];
            while (k > 0) {
                decompressedArray[j++] = nums[i + 1];
                k--;
            }
        }
        return decompressedArray;
    }

    public int[] decompressRLElist2(int[] nums) {
        int freq = 0;
        for (int i = 0; i < nums.length - 1; i = i + 2) {
            freq += nums[i];
        }
        int index = 0;
        int[] result = new int[freq];
        for (int i = 0; i < nums.length - 1; i = i + 2) {
            Arrays.fill(result, index, index + nums[i], nums[i + 1]);
            index += nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 1, 6, 2, 7, 1, 19, 4, 18};
        int[] res = decompressRLElist(nums);
        for (int i : res)
            System.out.println(i);
    }
}
