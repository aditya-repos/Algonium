package com.kepler51.ds.array.leetcode.easy;

public class RunningSum1480 {

    private static int sumOfArray(int[] ints){
        int sum = 0;
        for (int i: ints) {
            sum += i;
        }
        return sum;
    }

    private static int[] runningSum(int[] ints){
        int totalSum = sumOfArray(ints);

        int ele = ints[ints.length -1];
        for ( int i = ints.length -1; i >= 0; i-- ) {
            if(i == (ints.length -1)) {
                ints[i] = totalSum;
                continue;
            }
            int temp = ints[i];
            ints[i] = totalSum - ele;
            ele += temp;
        }
        return ints;
    }

    public int[] runningSum2(int[] nums) {
        int[] sum = new int[nums.length];
        sum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum[i] = sum[i-1] + nums[i];
        }
        return sum;
    }

    //memory Based
    public int[] runningSum3(int[] nums) {
        int l= nums.length;
        int runningSum=0;
        for(int i=0; i<l; i++){
            runningSum+=nums[i];
            nums[i]= runningSum;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] ints = {3,1,2,10,1};
        for ( int i : runningSum(ints)) {
            System.out.println(i);
        }
    }
}
