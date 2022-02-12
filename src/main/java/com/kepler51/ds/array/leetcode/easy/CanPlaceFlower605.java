package com.kepler51.ds.array.leetcode.easy;

public class CanPlaceFlower605 {

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {

        for (int i = 0; i < flowerbed.length; i++) {

            int isPlanted = flowerbed[i];
            if (isPlanted == 1) {
                i = i + 1;
                continue;
            }

            if(isPlanted == 0) {
                int previous = -1;

                if (i > 0)
                    previous  = flowerbed[i-1];

                if(i == flowerbed.length - 1 && previous != 1 && n == 0)
                    return true;

                if (i == flowerbed.length-1)
                    return false;

                int nextPlace = flowerbed[i + 1];

                if (nextPlace == 0) {
                    n = n - 1;
                    i = i+1;
                    if (n == 0)
                        return true;
                } else {
                    i = i + 1;
                }
            }
        }
        return n == 0;
    }


    public static void main(String[] args) {
        int[] flowerbed = {1,0,0,0,1,0,0};
        int n = 4 ;
        boolean res = canPlaceFlowers(flowerbed, n);
        System.out.println(res);
    }
}
