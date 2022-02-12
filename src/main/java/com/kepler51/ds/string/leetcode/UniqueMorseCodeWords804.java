package com.kepler51.ds.string.leetcode;

import java.util.HashSet;
import java.util.Set;

public class UniqueMorseCodeWords804 {

    public static int uniqueMorseRepresentations(String[] words) {
        String[] patterns = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> sets = new HashSet<>();

        for (String s : words ) {
            StringBuilder build = new StringBuilder();;
            for (char c : s.toCharArray()) {
                   build.append(patterns[ c - 'a']);
            }
            sets.add(build.toString());
        }
        return sets.size();
    }

    public static void main(String[] args) {
        String[] inp = {"gin"};
        System.out.println(uniqueMorseRepresentations(inp));
    }
}
