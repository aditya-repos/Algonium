package com.kepler51.ds.array.practice;

public class MaximumSumSubArray {

    private static int maximumSumSubArrayOfSizeK(int[] nums, int size){
        int start = 0;
        int end = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;

        while(end < nums.length) {
            if ((end - start + 1) <= size) {
                sum += nums[end++];
                max = Math.max(max,sum);
                continue;
            }
            sum = sum - nums[start++] + nums[end++];
            max = Math.max(max,sum);
        }
        return max;
    }


    private static int maximumSumSubArray(int[] numbers){
        int maxSum =numbers[0], currentSum = numbers[0];
        for (int i = 1; i < numbers.length ; i++) {
            currentSum = Math.max(numbers[i], currentSum + numbers[i]);
            if(currentSum > maxSum)
                maxSum = currentSum;
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int [] nums = {-2, -3, 4, -1, -2, 1, 5, -3};
        int res = maximumSumSubArrayOfSizeK(nums,2);
        System.out.println(res);
        res = maximumSumSubArray(nums);
        System.out.println(res);
    }
}
