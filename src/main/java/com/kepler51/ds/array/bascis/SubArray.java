package com.kepler51.ds.array.bascis;

public class SubArray {

    private static void printSubArray(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length ; j++) {
                for (int k = i; k <= j ; k++) {
                    System.out.print("{ "+nums[k] + " }");
                }
                System.out.println();
            }
            System.out.println("=========================");
        }
    }

    private static void addSubArray(int[] nums){
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length ; j++) {
                for (int k = i; k <= j ; k++) {
                    System.out.print("{ "+nums[k] + " }");
                }
                System.out.println();
            }
            System.out.println("=========================");
        }
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        printSubArray(nums);
    }
}
