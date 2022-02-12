package com.kepler51.ds.string.leetcode;

import java.util.Stack;

public class RemoveOutermostParentheses1021 {

    public String removeOuterParentheses(String s) {
        Stack<Character> stk = new Stack<>();
        String str = "";
        int start = 0;
        int end = 0;
        for(char c : s.toCharArray()) {
            if ('(' == c) {
                stk.push(c);
                end++;
            } else if (')' == c) {
                stk.pop();
                if (stk.isEmpty()) {

                }
            }
        }
        return "";
    }
}
