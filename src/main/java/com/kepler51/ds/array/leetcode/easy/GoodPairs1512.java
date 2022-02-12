package com.kepler51.ds.array.leetcode.easy;

import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

public class GoodPairs1512 {

    public static int numIdenticalPairs(int[] nums) {
        int i , j, goodPair = 0;
        for ( i = 0; i < nums.length-1; i++) {
            for ( j = i+1; j < nums.length ; j++) {
                if(nums[i] == nums[j] && i < j){
                    goodPair++;
                }
            }
        }
        return goodPair;
    }

    //Bet Runtime
    public int numIdenticalPairs2(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int count = 0;
        for (int num : nums) {
            count += map.getOrDefault(num, 0);
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return count;
    }


    public static void main(String[] args) {
        String name = "Ƣ";//ǴỳAditya Gaurav";
        byte[] bits = name.getBytes();
        System.out.println(bits.length);
        System.out.println(Charset.defaultCharset().name());
        int[] nums = {1,2,3};
        int res = numIdenticalPairs(nums);
        System.out.println(res);
    }
}
