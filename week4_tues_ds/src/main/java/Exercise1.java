package com.bnta.Exercises.week4_tues_ds.src.main.java;

import java.util.*;

public class Exercise1 {
    public static void main(String[] args) {
        String input = "1,1,1,1,3,4,5,6,7,7,7,8,8"; //this is the initial input; 1 long string
        Exercise1 exercise1 = new Exercise1();
        exercise1.occurrencesMethod(input);
    }

    public void occurrencesMethod(String input) {
        String[] stringArray = input.split(","); //splitting "input" by the "," to get an array of Strings
        Map<String, Integer> map = new HashMap<>(); //creating a HashMap called "map" where the datatype for key is
        //String and for value is Integer
        for (String e : stringArray) { //looping through stringArray where each element is "e"
            if (map.get(e) == null) { //if we have not already seen number e from stringArray in HashMap "map" as a key
                // then e will be made the key and 1 the value using .put() method. Value made equal to 1 because this
                // is the first instance where we have seen this particular key
                map.put(e, 1);
            } else {
                int count = map.get(e) + 1; //if we have seen number e in map then the current value of key e in our
                //HashMap is incremented once we come across this key e again
                map.put(e, count); //this replaces the old value of key e to the incremented value, called 'count' in
                //this instance
            }
        }
        
        //alternative method to do the above
//        for (String e : stringArray) {
//            map.put(e, (map.get(e) == null) ? 1 : map.get(e) + 1); //if map.get(e) is null then put 1 as the value of
//            //key e else put map.get(e) + 1 as the value of key e - ? is the ternary operator, replacement for if/else
//        }
        //----------------------------------
        
        
//        int max = 0;
        map.forEach((k, v) -> {
            System.out.println(k + " --> " + v); //instead of v in sout, can also put map.get(k)
//            if (v > max) {
//                max = v;
//            }
        });

    }
}
