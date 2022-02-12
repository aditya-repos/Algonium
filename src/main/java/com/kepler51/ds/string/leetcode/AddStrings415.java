package com.kepler51.ds.string.leetcode;

public class AddStrings415 {

    public static String addStrings(String num1, String num2) {
        int nums1 = 1, nums2 = 1;

        for (char c : num1.toCharArray()) {
            int i = c - '0';
            System.out.println(i);
            nums1 = nums1 * 10 + i;
        }
        System.out.println(nums1);
        return "";
    }


    public static void main(String[] args) {
        System.out.println(addStrings("12", "12"));
    }
}
