//package com.bnta.Exercises.week2_mon;
//
//public class Exercise7old {
//    public static void main(String[] args) {
//        String[] inputArray = {"a", "ab", "abc", "abcd"};
//        System.out.println(longestString(inputArray));
//    }
//
//    static String longestString(String[] inputArray) { //array of strings called inputArray
//        int[] lengthArray = new int[inputArray.length]; //creating lengthArray placeholder of length inputArray.length
//
//        for (int i = 0; i < inputArray.length; i++) {
//            lengthArray[i] = inputArray[i].length();
//        }
//        int max = findMaxIndex(lengthArray);
//        return inputArray[max];
//    }
//
//
//    static int findMaxIndex(int[] lengthArray) {
//        int maxNum = 0; //initialising maxInd by setting it to first value of lengthArray
//        int ind = 0;
//        for (int i = 1; i < lengthArray.length; i++) {
//            if (lengthArray[i] > maxNum) {
//                maxNum = lengthArray[i];
//                ind = i;
//            }
//        }
//        return ind;
//    }
//}
