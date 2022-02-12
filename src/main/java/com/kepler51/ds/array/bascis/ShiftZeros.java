package com.kepler51.ds.array.bascis;

public class ShiftZeros {
    public static int[] duplicateZeros(int[] arr) {
        int totalZero = countZeroInTheArray(arr);
        if (totalZero == 0)
            return null;
        int newLength = arr.length + totalZero;
        int[] newArr = new int[newLength];
        int j = 0;
        for(int i = 0; i < arr.length; i++){
            newArr[j++] = arr[i];
            if ( arr[i] == 0) {
                newArr[j++] = 0;
            }
        }
        return newArr;
    }

    private static int countZeroInTheArray(int[] arr){
        int zero = 0;
        for(int i : arr) {
            if (i == 0)
                zero++;
        }
        return zero;
    }

    public static void main(String[] args) {
        int[] arr = {0,2,3,0,4,5,0};
        arr = duplicateZeros(arr);
        for (int i: arr) {
            System.out.println(i);
        }
    }
}
