package com.company;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        String q = "()[]{}";
        System.out.println(isValid(q));
    }

    public static boolean isValid(String s) {
        char[] arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char current : arr) {
            if (current == '(' || current == '{' || current == '[') {
                stack.push(current);
                continue;
            }
            if (current == ')') {
                if (!stack.empty()) {
                    if (stack.peek() == '(') {
                        stack.pop();
                    } else {

                        return false;
                    }
                } else {
                    return false;
                }
            }
            if (current == '}') {
                if (!stack.empty()) {
                    if (stack.peek() == '{') {
                        stack.pop();
                    } else {

                        return false;
                    }
                } else {
                    return false;
                }
            }
            if (current == ']') {
                if (!stack.empty()) {
                    if (stack.peek() == '[') {
                        stack.pop();
                    } else {
                        return false;
                    }
                } else {

                    return false;
                }
            }

        }
        return stack.empty();
    }
}