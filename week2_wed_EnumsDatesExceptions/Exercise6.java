package com.bnta.Exercises.week2_wed;

import java.util.Arrays;

public class Exercise6 {
    public static void main(String[] args) {
        try {
            int addResult = 0;
            int counter = 0;
            int index = 0;


            for (int i = 0; i < args.length; i++) {
                int[] intArray = new int[counter];
                intArray[index] = Integer.parseInt(args[i]);
                counter++;
            }

            int[] intArray = new int[counter];
            for (int j = 0; j < intArray.length; j++) {
                addResult += intArray[j];
            }
            System.out.println(addResult);

        } catch (Exception e) {
            String[] errorStorage = args;
            System.out.println(errorStorage);
        }


    }
}
