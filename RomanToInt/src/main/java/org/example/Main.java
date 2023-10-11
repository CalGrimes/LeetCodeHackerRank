package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int i = solution.romanToInt("III");

        System.out.println(i);
    }

}

class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> romanNumerals = new HashMap<>();

        romanNumerals.put('I', 1);
        romanNumerals.put('V', 5);
        romanNumerals.put('X', 10);
        romanNumerals.put('L', 50);
        romanNumerals.put('C', 100);
        romanNumerals.put('D', 500);
        romanNumerals.put('M', 1000);

        int value = 0;
        int curr;

        for (int i = s.length()-1; i > -1; i--) {
            curr = romanNumerals.get(s.charAt(i));
            if (i != s.length()-1 && curr < romanNumerals.get(s.charAt(i+1)))
                value -= curr;
            else
                value += curr;
        }

        return value;
    }
}