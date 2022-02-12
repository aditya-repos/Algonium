package com.kepler51.designpattern.solid;

public class Test {

    public static void main(String[] args) {
        Rectangle rec = new Rectangle(10,20);
        Rectangle sqr = new Square(30);

        System.out.println(sqr.sample);
        System.out.println(sqr.getSample());
    }

    private static void printValues(Rectangle rec) {
        System.out.println(rec.getHeight());
        System.out.println(rec.getWidth());
    }
}
