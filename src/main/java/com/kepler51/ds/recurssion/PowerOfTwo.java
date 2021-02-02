package com.kepler51.ds.recurssion;

public class PowerOfTwo {

    private static boolean isPowerOfTwo(int num){
        //Base condition
        if(num == 2)
            return true;
        if(num % 2 != 0)
            return false;
        //Input reduction
        num = num / 2;
        //Tail recursion
        return isPowerOfTwo(num);
    }

    public static void main(String[] args) {
        boolean res = isPowerOfTwo(150);
        System.out.println(res);
    }
}
