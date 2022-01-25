package com.bnta.Exercises.week2_mon;

public class Exercise3 {
    public static void main(String[] args) {

        int[] args2 = new int[args.length];


        for (int i = 0; i < args.length; i++) {
            args2[i] = Integer.parseInt(args[i]);
            System.out.println(args2[i] % 2 == 0);

            if ((args2[i] % 2) == 0) {
                System.out.println(args2[i] + " is an even number");
            }
            else {
                System.out.println(args2[i] + " is an odd number");
            }
        }
    }
}
