package com.kepler51.ds.string.leetcode;

public class CountTheNumberOfConsistentStrings1684 {

    public static int countConsistentStrings(String allowed, String[] words) {

                int Consistent = 0;

        boolean isConsistent;
                for (String s : words) {

                     isConsistent = true;

                    for (char c : s.toCharArray()) {
                        if (allowed.indexOf(c) == -1) {
                            isConsistent = false;
                            break;
                        }
                    }

                    if(isConsistent)
                        Consistent++;
                }
                return Consistent;
    }

    public int countConsistentStrings2(String allowed, String[] words) {
        int mask = 0;
        for (int i = 0; i < allowed.length(); i++) {
            mask |= (1 << allowed.charAt(i) - 'a');
        }
        int count = words.length;
        for (String word: words) {
            for (int i = 0; i < word.length(); i++) {
                if ((mask & (1 << word.charAt(i) - 'a')) == 0) {
                    count--;
                    break;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String allowed = "cad";
        String[] words = {"cc","acd","b","ba","bac","bad","ac","d"};

        System.out.println(countConsistentStrings(allowed, words));
    }


}
