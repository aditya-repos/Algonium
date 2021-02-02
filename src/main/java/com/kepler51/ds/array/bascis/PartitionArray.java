package com.kepler51.ds.array.bascis;

public class PartitionArray {

    private static void partitionArray(int[] nums){
        if(nums.length == 1)
            return;
        int i = 0;
        int j = nums.length -1;
        int pivot = nums[j];
        while(i < j){
            while(nums[i] <= pivot)
                i++;
            while (nums[j] >= pivot)
                j--;
            swap(nums, i, j);
        }
    }

    private static void partitionArray2(int[] nums){
        if(nums.length == 1)
            return;
        int i;
        int partitionIndex = 0;
        int pivot = nums[nums.length -1];
        for (i = 0; i < nums.length - 1 ; i++) {
            if(nums[i] <= pivot) {
                swap(nums, i, partitionIndex);
                partitionIndex++;
            }
        }
        swap(nums, partitionIndex, nums.length - 1);
    }

    private static void partitionArray(int[] nums, int index1, int index2){
        if(nums.length == 1)
            return;
        int i = index1;
        int j = index2;
        int pivot = nums[j];
        while(i < j){
            while(nums[i] <= pivot)
                i++;
            while (nums[j] > pivot)
                j--;
            swap(nums, i, j);
        }
    }

    private static void swap(int[] nums, int index1, int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {10,2,45,15,6,89,1,78,20,-1,15,13};
        partitionArray2(nums);
        //partitionArray(nums, 0, 1);
        for (int i : nums)
            System.out.println(i);
    }
}
