package com.kepler51.ds.array.leetcode;

public class ShuffleArray1470 {
    private static int[] shuffle(int[] nums, int n) {
        int[] shuffle = new int[nums.length];
        int i,j,k=0;
        for (i=0,j=n;  i< n && j < nums.length; i++,j++) {
            shuffle[k] = nums[i];
            shuffle[k+1] = nums[j];
            k = k +2;
        }
        return shuffle;
    }

    //Best Memory
    public int[] shuffle2(int[] nums, int n) {
        int[] shuffled = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            shuffled[i] = i % 2 == 0 ? nums[i / 2] : nums[n++];
        }
        System.gc();
        return shuffled;
    }

    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        for (int i : shuffle(nums, nums.length/2))
            System.out.println(i);
    }
}
