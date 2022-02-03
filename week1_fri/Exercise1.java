package com.bnta.Exercises.week1_fri;

import java.util.Random;

public class Exercise1 {
    public static void main(String[] args) {

        Random rand = new Random();

        int number1 = rand.nextInt(2);
        int number2 = rand.nextInt(2);
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number1==number2);

    }
}
