package com.kepler51.ds.string.leetcode;

public class ShuffleString1528 {
    public static String restoreString(String s, int[] indices) {
        char[] chars = new char[indices.length];
        for (int i = 0; i < indices.length; i++ ) {
            chars[indices[i]] = s.charAt(i);
        }
        return String.valueOf(chars);
    }


    public static void main(String[] args) {
        int[] ints = {4,0,2,6,7,3,1,5};
        System.out.println(restoreString("aaiougrt", ints));
    }
}
