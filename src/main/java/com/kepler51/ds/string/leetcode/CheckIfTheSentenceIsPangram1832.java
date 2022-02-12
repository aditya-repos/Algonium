package com.kepler51.ds.string.leetcode;

import java.util.Locale;

public class CheckIfTheSentenceIsPangram1832 {

    public static boolean checkIfPangram(String sentence) {
        int[] alpha = new int[26];

        for(char c : sentence.toCharArray()) {
            alpha[c - 'a'] = 1;
        }

        for (int i : alpha)
            if (i == 0)
                return false;

        return true;
    }


    public static boolean checkIfPangram2(String sentence) {

        char a  = 'a';

        for( int i = 0; i < 26 ;i++) {
            if (sentence.indexOf(a +  i) == -1 )
                return false;
        }

        return true;
    }

    public boolean checkIfPangram3(String sentence) {
        if(sentence.length() < 26)
            return false;
        String str = "abcdefghijklmnopqrstuvwxyz";
        for(int i=0 ;i<str.length() ; i++)
            if(sentence.indexOf(str.charAt(i)) == -1)
                return false;
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkIfPangram2("thequickbrownfoxjumpsoverthelayzdog"));
    }
}
