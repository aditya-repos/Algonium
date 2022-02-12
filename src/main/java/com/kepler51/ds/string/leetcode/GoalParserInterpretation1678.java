package com.kepler51.ds.string.leetcode;

public class GoalParserInterpretation1678 {

    public static String interpret(String command) {
        StringBuilder build = new StringBuilder("");
        for(int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == 'G') {
                build.append("G");
            } else if (command.charAt(i) == '(' && command.charAt(i + 1) == ')') {
                build.append("o");
                i = i + 1;
            } else if (command.charAt(i) == '(' && command.charAt(i + 1) == 'a') {
                build.append("al");
                i = i + 2;
            }

        }
        return build.toString();
    }

    public String interpret2(String command) {
        return (command.replace("()", "o").replace("(al)", "al"));
    }

    public static void main(String[] args) {
//        G -> G
//        () -> o
//        (al) -> al
        System.out.println(interpret("G()()()()(al)"));
    }
}
