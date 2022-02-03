package com.bnta.Exercises.week1_fri;

import java.util.Arrays;

public class Exercise4 {
    public static void main(String[] args) {

        String string_input = "0.90, 1.00, 9.00, 8.78, 0.01"; //storing string data in variable 'string_input'
        String[] split_nums = string_input.split(", "); //Array of separate strings named 'split_nums'
        System.out.println(Arrays.toString(split_nums));
        double sum = 0;
        for (int i = 0; i < split_nums.length; i++) {
//            System.out.println(split_nums[i]);
            double result = Double.parseDouble(split_nums[i]);
//            System.out.println(result);

            sum += result;

        }
        System.out.println(sum);
    }
}
