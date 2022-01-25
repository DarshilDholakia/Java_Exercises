package com.bnta.Exercises.week2_mon;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.*;

public class Exercise5 {
    public static void main(String[] args) {

        boolean flag = true;

        while (flag) {
            printQuestion();
            Scanner scan = new Scanner(System.in);
            String input = scan.next();

            String[] jokeArray = {"Joke1", "Joke2", "Joke3"};
            Random rndJoke = new Random();
            int rndIndex = rndJoke.nextInt(jokeArray.length);

            if (input.equals("yes")) {
                System.out.println("Here is your joke...");
                System.out.println(jokeArray[rndIndex]);
            }
            else if (input.equals("no")) {
                System.out.println("Thank you for playing");
                flag = false;
            }
        }
    }

    static void printQuestion() {
        System.out.println("Do you want a joke?");
    }
}
