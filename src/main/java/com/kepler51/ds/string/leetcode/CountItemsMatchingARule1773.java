package com.kepler51.ds.string.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountItemsMatchingARule1773 {

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int totalMatchedRule = 0;

        for(List<String> l : items) {

            switch (ruleKey) {
                case "type" :
                    if (l.get(0).equals(ruleValue))
                        totalMatchedRule++;
                    break;
                case "color":
                    if (l.get(1).equals(ruleValue))
                        totalMatchedRule++;
                    break;
                case "name":
                    if (l.get(2).equals(ruleValue))
                        totalMatchedRule++;
                    break;
            }
        }
        return totalMatchedRule;
    }


    public static int countMatches2(List<List<String>> items, String ruleKey, String ruleValue) {

        int count=0;
        int check=-1;

        switch(ruleKey){
            case "type" : check=0;
                          break;
            case "color" : check=1;
                           break;
            case "name" : check=2;
                          break;
        }

        int n=items.size();

        for(int i=0;i<n;i++){
            if(ruleValue.equals(items.get(i).get(check))){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<String> input = Arrays.asList("phone","blue","pixel");
        List<String> input2 = Arrays.asList("computer","silver","phone");
        List<String> input3 = Arrays.asList("phone","gold","iphone");

        List<List<String>> lists = Arrays.asList(input,input2, input3);
        String ruleKey = "type", ruleValue = "phone";

        System.out.println(countMatches2(lists, ruleKey, ruleValue));

    }


}
