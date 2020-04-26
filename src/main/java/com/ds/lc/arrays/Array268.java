package com.ds.lc.arrays;

public class Array268 {
    public static int missingNumber(int[] nums) {
        int element = nums.length;
        int tSum = (element * (element + 1))/2;
        int sum = 0;
        for(int i : nums){
            sum += i;
        }
        return tSum - sum;
    }

    public int missingNumber2(int[] nums) {
        if (nums.length == 0)
            return 0;
        int len = nums.length;
        int total = (1 + len) * len / 2;
        for (int num : nums) {
            total -= num;
        }
        return total;
    }
    public static void main(String[] args) {
        int[] nums = {3,0,1,4,6,2,5,7,8,9,10,11,12,14,13,16};
        int res = missingNumber(nums);
        System.out.println(res);
    }
}
