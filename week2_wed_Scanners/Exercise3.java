package com.bnta.Exercises.week2_wed_Scanners;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) throws FileNotFoundException {

        File inputFile = new File("/Users/darshildholakia/Documents/Main1/src/com/bnta/Exercises/week2_wed_Scanners/text_file.txt");
        Scanner scanner = new Scanner(inputFile); //creating a Scanner object called 'input' which will take the input from 'inputFile'

        while (scanner.hasNext()) { // this means that while scanner can see that there is content on the next line...
            String localVariable = scanner.nextLine(); //storing the content of the current line into the variable localVariable (as long as there is content on the next line)
            System.out.println(localVariable); //while there is content on the next line, the content of the current line, stored in variable 'localVariable', will be printed - this is looped for every line
        }
    }
}
