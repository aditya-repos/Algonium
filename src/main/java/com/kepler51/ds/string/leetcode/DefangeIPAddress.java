package com.kepler51.ds.string.leetcode;

public class DefangeIPAddress {

    public static String defangIPaddr(String address) {
        StringBuilder build = new StringBuilder("");
        for (char c : address.toCharArray()) {
            if (c == '.') {
                build.append("[").append(".").append("]");
            } else {
                build.append(c);
            }
        }
        return build.toString();
    }

    public static String defangIPaddr2(String address) {
        return address.replace(".", "[.]");
    }

    public static void main(String[] args) {
        System.out.println(defangIPaddr("1.1.1.1"));
    }
}
