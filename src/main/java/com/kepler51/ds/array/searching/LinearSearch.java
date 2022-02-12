package com.kepler51.ds.array.searching;

public class LinearSearch {

    private static boolean doLinearSearch(final int[] nums, int numberToSearch){
        if (nums == null) {
            return false;
        }
        for (int num: nums) {
            if (num == numberToSearch) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        int[] nums = {1,2,3,4,99,0};
        System.out.println(doLinearSearch(nums, 99));
        System.out.println(doLinearSearch(nums, 9));
    }
}
