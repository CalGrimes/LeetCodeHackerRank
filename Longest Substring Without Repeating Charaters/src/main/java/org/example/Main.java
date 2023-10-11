package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int i = solution.lengthOfLongestSubstring("abcabcbb");

        System.out.println(i);
    }

}


class Solution {
    public int lengthOfLongestSubstring(String s) {

        List<Character> distinctLetter = new ArrayList<>();
        int highest = 0;
        int index;

        for (int i = 0; i < s.length(); i++) {
            if (!distinctLetter.contains(s.charAt(i))) {
                distinctLetter.add(s.charAt(i));
            }
            else {
                index = distinctLetter.indexOf(s.charAt(i))+1;

                distinctLetter = distinctLetter.subList(index, distinctLetter.size());
                distinctLetter.add(s.charAt(i));
            }


            if (distinctLetter.size() > highest)
                highest = distinctLetter.size();

        }
        return highest;

    }
}