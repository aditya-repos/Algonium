package com.kepler51.ds.array.gfg.array;

public class MaxCandy {

    static int maxCandy(int height[], int n)
    {
        int maxCandy = Integer.MIN_VALUE;
        int candy = 0;
        for (int i = 0; i < height.length ; i++) {
            for (int j = i + 1; j < height.length -1 ; j++) {
                int minHeight = Math.min(height[i], height[j]);
                candy = minHeight * (j - i);
                if (maxCandy < candy)
                    maxCandy = candy;
            }
        }
        return maxCandy;
    }

    public static void main(String[] args) {
        int height[] = {2, 1, 6, 4, 6, 6};
        int res = maxCandy(height, height.length);
        System.out.println(res);
    }
}
