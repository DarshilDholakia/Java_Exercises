package com.bnta.Exercises.week2_wed;

import java.time.LocalDateTime;
import java.time.LocalDate;
import java.util.Date;

public class Exercise4 {
    public static void main(String[] args) {
        System.out.println(LocalDateTime.now());
        LocalDate dob = LocalDate.of(1998, 9, 9);
        System.out.println(dob);
        LocalDate dobPlus100 = dob.plusDays(100);
        System.out.println(dobPlus100);
    }
}
