package com.bnta.Exercises.week2_mon;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.nextLine();

//        System.out.println(email + " is valid = " + validateEmail(email));

        if (validateEmail(email) == true) {
            System.out.println(email + " is valid");
        }
        else {
            System.out.println(email + " is not valid");
        }
    }

    static boolean validateEmail(String input) {
        String regex = "[\\w-]{1,20}@\\w{2,20}\\.\\w{2,3}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }
}

/*
The Steps are:
1. does it contain an "@" symbol?
2. does it contain "gmail.com" after the @ symbol?
3.
 */
