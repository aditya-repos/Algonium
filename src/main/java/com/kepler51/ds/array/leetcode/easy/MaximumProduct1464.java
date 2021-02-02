package com.kepler51.ds.array.leetcode.easy;

import java.util.Arrays;

public class MaximumProduct1464 {
    public static int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length;
        return ((nums[length-2]-1) * (nums[length-1]-1));
    }

    public static int maxProduct2(int[] nums) {
        int max = 0, i = 0, j = nums.length - 1;
        while(i < j) {
            max = Math.max(max, (nums[i] - 1) * (nums[j] - 1));
            if(nums[i] > nums[j]){
                j--;
            }
            else{
                i++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {3,7,1,4,5,6,3,1,9};
        int res = maxProduct2(nums);
        System.out.println(res);
    }
}
