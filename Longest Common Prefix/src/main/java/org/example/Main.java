package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String i = solution.longestCommonPrefix(new String[]{"flower", "flow", "flight"});

        System.out.println(i);
    }

}

class Solution {
        public String longestCommonPrefix(String[] strs) {
            String first = strs[0];

            for (int i = 1; i < strs.length; i++) {

                for(int j = 0; j < first.length() && j < strs[i].length(); j++){
                    if (strs[i].charAt(j) != first.charAt(j)) {
                        first = first.substring(0, j);
                    }
                }
            }

            return first;

        }
}