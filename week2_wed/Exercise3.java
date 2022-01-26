package com.bnta.Exercises.week2_wed;

public class Exercise3 {
    public static void main(String[] args) {
        TshirtSize arr[] = TshirtSize.values(); //.values() method is used to access the values inside the enum. Here it is used to store all the values in arr[] - this is an array filled with datatype 'TshirtSize'

        for (TshirtSize tsize : arr) { // here the index is named 'tsize'. this step loops through the 'arr' array
            System.out.println(tsize.name().toLowerCase()); //this step takes the value in the 'arr' array at step tsize and applies the .name() method which then allows us to convert from TshirtSize datatype to String datatype therefore enabling .toLowerCase() method.
        }
    }
}
