package com.kepler51;

import java.util.LinkedHashMap;
import java.util.Map;

public class Sample {

    public static void main(String[] args) {
        String name="AdiaDITYtay";
        System.out.println(name);
        //output=A-3,d-2,i-2,T-2,Y-2
    }

    private static void occuranceOfCharacters(String input) {

        Map<Character, Integer> charOccurances = new LinkedHashMap<>();

        for(char c : input.toCharArray()) {
            boolean lowercase = Character.isLowerCase(c);

            if (charOccurances.containsKey(c)) {
                int occurnabces = charOccurances.get(c);
                charOccurances.put(c,occurnabces++);
            } else if (lowercase) {
                int occurnabces = charOccurances.get(c);
                charOccurances.put(c,occurnabces++);
            } else if (!lowercase) {
                int occurnabces = charOccurances.get(c);
                charOccurances.put(c,occurnabces++);
            } else {
                charOccurances.put(c,1);
            }
        }
    }
}
