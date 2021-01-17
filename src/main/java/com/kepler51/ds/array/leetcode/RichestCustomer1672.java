package com.kepler51.ds.array.leetcode;

public class RichestCustomer1672 {

    public static int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum += accounts[i][j];
            }
            if( sum >= max) {
                max = sum;
            }
        }
        return max;
    }

    //Memory Allocation
    public int maximumWealth2(int[][] accounts) {
        int max = 0;
        for(int[] account: accounts){
            int account_money = 0;
            for(int money: account){
                account_money += money;
            }
            max = Math.max(account_money, max);
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] accounts = new int[][]{{2,8,7},{7,1,3},{1,9,5}};
        int res = maximumWealth(accounts);
        System.out.println(res);
    }
}
