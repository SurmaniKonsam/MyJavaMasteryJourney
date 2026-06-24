package org.example.thirtyLPAPackage.exercise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

//System.exit.
//Arrays.toString(String[] arr);
public class FileReading {
    static void readRepeatedWords(char enterChar,String filePath) throws FileNotFoundException {
        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line =  bufferedReader.readLine();
            String toCompare = String.valueOf(enterChar);
            int countSWords = 0;
            while(line!=null){
                String[] grab = line.toLowerCase().split(",");
                for(String s : grab){
                    if(s.trim().contains(toCompare)){
                        countSWords++;
                    }
                }
                System.out.println(Arrays.toString(grab));
                line = bufferedReader.readLine();
            }
            System.out.println("total counted words : "+countSWords);
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        String path = "Java_Course/src/main/java/org/example/TwentyLPAPackage/Files/people-1000.csv";
        readRepeatedWords('@',path);
    }
}
