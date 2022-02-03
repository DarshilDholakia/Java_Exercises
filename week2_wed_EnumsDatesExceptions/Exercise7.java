package com.bnta.Exercises.week2_wed;

import java.time.LocalDate;

public class Exercise7 {
    public static void main(String[] args) {
        LocalDate day1 = LocalDate.of(1998,9,9);
        LocalDate day2 = LocalDate.of(2022,9,9);

        LocalDate[] arrLocalDate = {day1, day2};
        System.out.println(sumDays(arrLocalDate));
    }

    static int sumDays(LocalDate[] input) {

        int result = 0;
        for (int i = 0; i < input.length; i++) {
            result += input[i].getDayOfMonth();
        }

        return result;
    }
}
