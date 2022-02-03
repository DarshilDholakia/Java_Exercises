package com.bnta.Exercises.week2_wed;

import java.sql.PreparedStatement;
import java.time.LocalDate;

public class Exercise5 {
    public static void main(String[] args) {
        System.out.println(calculateAge(LocalDate.of(2005,5,9)));
    }

    private static int calculateAge(LocalDate date) {
        LocalDate dob = LocalDate.of(1998, 9, 9);
        int result = date.getYear() - dob.getYear();
        return result;
    }
}
