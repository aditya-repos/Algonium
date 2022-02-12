package com.kepler51.ds.string.leetcode;

public class SplitStringInBalancedStrings1221 {

    public static String sortSentence(String s) {

        String[] strings = s.split(" ");
        String[] shorted = new String[strings.length];

        for(String str : strings) {
            String i = str.substring(str.length()-1);
            int j = Integer.parseInt(i);
            System.out.println(i);
            shorted[j-1] = str.substring(0,(str.length()-1));
        }

        StringBuilder build = new StringBuilder("");
        for (String str : shorted)
            build.append(str).append(" ");
        return build.toString().trim();
    }

    public String sortSentence2(String s) {
        String[] split = s.split(" ");
        String[] out = new String[split.length];

        for(int i=0; i<split.length; i++)
        {
            String t = split[i];

            int pos = t.charAt(t.length()-1)-'0';

            t = t.substring(0,t.length()-1);
            out[pos-1]=t;
        }

        StringBuilder sb = new StringBuilder();

        for(int j=0; j<out.length; j++)
        {
            sb.append(out[j]).append(" ");
        }

        return sb.toString().trim();
    }


    public static void main(String[] args) {

        String s = "Aditya";
        System.out.println(s.length());
        for (int i =0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }
        System.out.println(sortSentence("is2 sentence4 This1 a3"));
    }
}
