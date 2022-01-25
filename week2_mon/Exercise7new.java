package com.bnta.Exercises.week2_mon;

import java.util.ArrayList;

public class Exercise7new {
    public static void main(String[] args) {
        System.out.println(analyser(args));
    }

    static String analyser(String[] input) {

        ArrayList<String> longestString = new ArrayList<>();

        for (int i = 1; i < input.length; i++) {
            if (input[i].length() >= input[i-1].length()) {

                ArrayList longestString = input[i];

            }
        }

        return longestString;
    }
}

/*
Steps:
1. user inputs words into the terminal
2. these words are then passed as arguments through a method
4. loop through all elements of input array and count size of all strings
4. longest elements populate another empty array
5. this array is converted to a string using Arrays.toString()
6. this string is then returned by this method (therefore the end return value is a String
 */