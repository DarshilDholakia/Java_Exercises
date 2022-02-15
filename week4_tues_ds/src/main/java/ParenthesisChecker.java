package com.bnta.Exercises.week4_tues_ds.src.main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ParenthesisChecker {
    public static void main(String[] args) {
        String brackets = "[{{[(){}]}}[]{}{{(())}}]"; //regex can be added to make sure user only inputs brackets and
        //nothing else
        ParenthesisChecker parenthesisChecker = new ParenthesisChecker();
        System.out.println(parenthesisChecker.isBalanced(brackets));
    }

    public boolean isBalanced(String input) {
        char[] charArray = input.toCharArray();
        List<Character> charList = new ArrayList<>();
        for (char c : charArray) {
            charList.add(c);
        }

        Stack<Character> openCharStack = new Stack<>();
        for (int i = 0; i < charList.size(); i++) {
            if (charList.get(i) == '[' || charList.get(i) == '{' || charList.get(i) == '(') {
                openCharStack.push(charList.get(i));//this is now adding all the opening brackets to openCharStack from
                // charList
                charList.remove(i);
            }
            if (charList.get(i) == ']' || charList.get(i) == '}' || charList.get(i) == ')') {
                if (openCharStack.isEmpty()) {
                    return false; //if Stack becomes empty before finishing looping through charList
                } else if (charList.get(i) == ']' && openCharStack.peek() == '[' ||
                        charList.get(i) == '}' && openCharStack.peek() == '{' ||
                        charList.get(i) == ')' && openCharStack.peek() == '(') {
                    openCharStack.pop(); //if match was made between charList and Stack, first element will be popped
                    //out of the Stack
                } else return false; //if charList becomes empty first before the Stack
            }
        }
        System.out.println(openCharStack);
        System.out.println(charList);
        return openCharStack.isEmpty(); //if false then it means brackets don't match

    }
}
