//package com.bnta.Exercises.week2_mon;
//
//import java.util.Scanner;
//
//public class Exercise4 {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Please enter a number:");
//        int number = scan.nextInt();
//
//        prime_or_not(number);
//    }
//
//    static void prime_or_not(int number) {
//        boolean flag = false;
//
//        for (int i = 2; i <= number / 2; i++) {
//            if (number % i == 0) {
//                flag = true;
//                break;
//            }
//        }
//        if (flag) {
//            System.out.println(number + " is not a prime number");
//            ;
//        } else {
//            System.out.println(number + " is a prime number");
//            ;
//        }
//    }
//}
