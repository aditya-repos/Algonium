package com.kepler51.ds.numbers;

public class PrintAllDigits {

    public static void printAllDigits( int number) {

        int divisor = 10;

        while (number > 0){

            System.out.println(number % divisor);

            number = number / 10;

            System.out.println("Number after division " + number);

        }
    }

    public static void main(String[] args) {

        System.out.println(1/2);

        System.out.println(1%2);

        printAllDigits(1234);
    }
}
