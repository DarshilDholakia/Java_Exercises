package com.bnta.Exercises.week2_mon;

import java.util.Arrays;

public class Exercise7new {
    public static void main(String[] args) {
        String[] inArray = {"a", "ab", "abc", "abc", "ab"};
        System.out.println(Arrays.toString(analyser(inArray)));

    }

    static String[] analyser(String[] input) {

        int counter = 0; //counter is initialised to 0
        int max = 0; //max is initialised to 0

        for (int i = 0; i < input.length; i++) {
            int wordSize = input[i].length();
            if (max == wordSize) {
                counter++;
            } else if (max < wordSize) {
                max = wordSize;
                counter = 1;
            }
        }

        String[] answer = new String[counter]; // "answer" which is an array of strings, set to be the size of "counter"
        int index = 0; //index is initialised to 0

        for (int i = 0; i < input.length; i++) {
            int wordSize = input[i].length();   //set wordSize variable to length of each element in input array
            if (max == wordSize) {              //if max is equals to wordSize...
                answer[index] = input[i];       // this line basically sets the value at i in 'input' array in the position index within the answer array
                index++;                        // then, index must be incremented so then, if there are multiple longest words, the next one can be stored in an index position (within the arrays index) that is 1 higher
            }
        }
        return answer;
    }
}