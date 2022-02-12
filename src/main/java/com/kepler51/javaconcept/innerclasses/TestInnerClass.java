package com.kepler51.javaconcept.innerclasses;

public class TestInnerClass {
    private static Port port1;

    public static void main(String[] args) {
        System.out.println(port1);
        InnerClass inner = new InnerClass();
        System.out.println(inner.discription);

        Port port = new Port();
        System.out.println(port.port);
        System.out.println(port.portTLS);

        Object obj = new Object();

        Integer ints = 8;

        obj = ints;

        ints = (Integer) obj;

        System.out.println(ints);
    }
}
