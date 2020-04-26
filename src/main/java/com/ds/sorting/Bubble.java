package com.ds.sorting;

public class Bubble {

    private static void sort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {2, 9, 1, 0, 5, 3, 7, 8};
        sort(nums);
        for (int i : nums)
            System.out.println(i);
    }
}
