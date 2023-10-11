package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        Boolean i = solution.validParenthese("adaac(fesef)");

        System.out.println(i);
    }

}


class Solution {
    public boolean validParenthese(String s) {
        // brackets can be either (), [], or {}

        // if the string is empty, return true
        if (s.length() == 0) {
            return true;
        // if the string is odd, return false
        } else if (s.length() % 2 != 0) {
            return false;
        }

        // create a stack to store the brackets
        Stack<Character> stack = new Stack<>();

        // iterate through the string
        for (int i = 0; i < s.length(); i++) {
            // if the character is an opening bracket, push it to the stack
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));

            // if the character is a closing bracket, pop the stack and compare
            } else if (s.charAt(i) == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (s.charAt(i) == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else if (s.charAt(i) == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            }

        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }




    }
}