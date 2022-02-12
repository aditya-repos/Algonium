package com.kepler51.ds.string.leetcode;

public class CheckIfTwoStringArraysAreEquivalent1662 {

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        StringBuilder build1 = new StringBuilder();
        StringBuilder build2 = new StringBuilder();

        for (String s : word1)
            build1.append(s);

        for (String s : word2)
            build2.append(s);

        return build1.toString().equals(build2.toString());
    }

    public boolean arrayStringsAreEqual2(String[] word1, String[] word2) {
        StringBuilder word1String = new StringBuilder();
        StringBuilder word2String = new StringBuilder();

        for (int i = 0; i < word1.length; i++) {
            word1String.append(word1[i]);
        }
        for (int i = 0; i < word2.length; i++) {
            word2String.append(word2[i]);
        }
        return word1String.toString().equals(word2String.toString());
    }



    public static void main(String[] args) {
        String[] build = {"a", "cb"};
        String[] build2 = {"ab", "c"};

        System.out.println(arrayStringsAreEqual(build, build2));
    }
}
