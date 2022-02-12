package com.kepler51.ds.array.leetcode.easy;

public class XorOperation1486 {
    public static int xorOperation(int n, int start) {
        if (n == 1) {
            return start;
        }
        int result = start;
        int num;
        for (int i = 1; i < n; i++) {
            num = start + 2*i;
            result ^= num;
        }
        return  result;
    }

    public static void main(String[] args) {
        int n = 5, start = 0;
        int res = xorOperation(n, start);
        System.out.println(res);
    }
}
