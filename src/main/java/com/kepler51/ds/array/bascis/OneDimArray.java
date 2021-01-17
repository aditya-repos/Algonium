package com.kepler51.ds.array.bascis;

import java.util.ArrayList;

public class OneDimArray {


    private static void traverseMyArray(){
        int[] numbers = new int[]{10,20,30,40,};
        for(int i: numbers){
            System.out.println(i);
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        int[] numbers2 = new int[2];
        for(int i: numbers2){
            System.out.println(i);
        }

        for (int i = 0; i < numbers2.length; i++) {
            System.out.println(numbers2[i]);
        }
    }

    private static void oneDimArray(){
        /**
         * Array creation
         */
        //<type_array>[] <name_array> = new <type_array>[size_of_array]
        int[] ints = new int[2];
        //[<4_byte_space>,<4_byte_space>]

        //Array
        //[]
        int[] numbers = {};
        int[] nonNumbers = null;
        int[] mixNumbers = {1,1,2};
        //how to set value
        ints[0] = 12;
    }

    private static void twoDimArray(){
        //<type> Array of Array
        //[][]
        int[][] intsNum = new int[4][];
        String[] names = new String[2];
        ArrayList[] lists = new ArrayList[8];
    }
    public static void main(String[] args) {
        traverseMyArray();
    }
}
