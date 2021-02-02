package com.kepler51.ds.recurssion;

public class AddNumber {

    private static int addNumber(int num, int sum){
        if (num == 0 )
            return sum;

            sum += num;
            return addNumber(num - 1, sum);
    }

    public static void main(String[] args) {
        int res = addNumber(10, 0);
        System.out.println(res);
    }
}
