package com.kepler51.ds.array.searching;

public class BinarySearch {

    private static boolean binarySearch( int[] nums, int num, int start, int end) {
        if( start > end ) {
            return false;
        }
        int mid = (start + end) / 2;
       
        if (nums[mid] == num) {
            return true;
        }
        else if (nums[mid] > num) {
            end = mid - 1;
            return binarySearch(nums, num, start, end);
        }
        else {
            start = mid + 1;
            return binarySearch(nums, num, start, end);
        }
    }

    public static void main(String[] args) {
        int[] nums = {100};
        System.out.println(binarySearch(nums, 101, 0, nums.length -1));
    }
}
