package Exercise1;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Exercise1B {
    public static void main(String[] args) throws IOException { //throws IOException is there because FileReader() class
        //has a throw IOException built into it therefore we can either throw it or deal with it, in this case, we are
        //throwing it
        File file = new File("/Users/darshildholakia/Documents/oop9B/src/data.txt");
        LineNumberReader lineNumberReader = new LineNumberReader(new FileReader(file));

        int totalLines; //creating integer variable 'totalLines'
        while (lineNumberReader.readLine() != null) ; //while the lineNumberReader object can read content on current
        //line i.e. it is not null...
        totalLines = lineNumberReader.getLineNumber(); //this is a getter, and it gets the number of the current line

        String[] line = new String[totalLines]; //'line' is an array of size however many lines there are in the text
        //file
        for (int i = 0; i < totalLines; i++) { //looping through the number of lines in the text file
            line[i] = Files.readAllLines(Paths.get("/Users/darshildholakia/Documents/oop9B/src/data.txt")).get(i);
            // indexing each line in data.txt to enable easier access to each line later. RHS gets ith line in file and
            //shoves it into the ith position of the 'line' array
        }

        String[] wordArray; //didn't have to specify what the size of each of the wordArray arrays would need to be...
        PersonClass[] people = new PersonClass[line.length]; //'people' array of PersonClass class and of size however
        //many lines there are in text file
        for (int i = 0; i < line.length; i++) {
            wordArray = line[i].split(","); //ith line is split by "," using .split() and that array is shoved
            //into wordArray array
            int intID = Integer.parseInt(wordArray[0]); //converting id in string form to integer form
            Gender gender = Gender.valueOf(wordArray[4]); //converting string gender to enum gender

            //CREATING THE OBJECT
            people[i] = new PersonClass(intID, wordArray[1], wordArray[2], wordArray[3], gender);
        }
        System.out.println(people[3].toString());
    }
}

