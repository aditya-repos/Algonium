package com.kepler51.ds.array.leetcode;

public class E581 {
    public static int findUnsortedSubarray(int[] nums) {
        if (nums == null)
            return -1;
        if (nums.length == 1)
            return 0;
        int startCount = -1, endCounter = -1;
        int greatestNumber = 0;
        boolean found = false;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                if (startCount == -1) {
                    startCount = i;
                    found = true;
                }
                greatestNumber = Math.max(greatestNumber, nums[i]);
                endCounter = i + 1;
            }
            else if (found && greatestNumber > nums[i]) {
                endCounter = i;
            }
        }
        if (startCount == -1)
            return 0;
        return endCounter - startCount + 1;
    }

    public static void main(String[] args) {
        Boolean test = true;
        int[] nums4 = {2, 4, 4, 8, 10, 16, 15, 11, 13, 16, 18};
        int[] nums3 = {2, 4, 4, 8, 10, 16, 15, 11, 13, 17, 14,15, 18};
        int[] nums1 = {2, 6, 4, 8, 10, 16, 15, 11, 18, 14, 15, 16, 19};
        int[] nums = {2, 2,2,2,1};
        int res = findUnsortedSubarray(nums);
        System.out.println(res);
    }
}
