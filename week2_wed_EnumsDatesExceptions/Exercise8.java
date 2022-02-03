package com.bnta.Exercises.week2_wed;

public class Exercise8 {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("CANNOT DIVIDE BY 0");
        }

    }
}
