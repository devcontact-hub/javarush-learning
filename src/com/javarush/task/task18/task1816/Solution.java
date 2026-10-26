package com.javarush.task.task18.task1816;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* 
Английские буквы
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        int countOfEnglishChars = 0;
        try (FileReader fileReader = new FileReader(args[0])) {
            int line;
            while ((line = fileReader.read()) != -1) {
                char readChar = (char) line;
                if (readChar >= 'A' && readChar <= 'Z'
                || readChar >= 'a' && readChar <= 'z') countOfEnglishChars++;
            }
        }
        System.out.println(countOfEnglishChars);
    }
}