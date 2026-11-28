package com.javarush.task.task19.task1907;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Считаем слово
*/

public class Solution {
    private static int counter = 0;
    public static void main(String[] args) throws IOException {
        String fileInput;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            fileInput = bufferedReader.readLine();
        }

        StringBuilder text = new StringBuilder();
        try (FileReader fileReader = new FileReader(fileInput)) {
            int currentChar;
            while ((currentChar = fileReader.read()) != -1) {
                text.append((char) currentChar);
            }
        }

        String[] textSplit = text.toString().split("[\\p{P}\\s]+");
        for (String x : textSplit) {
            if (x.equals("world")) {
                counter++;
            }
        }

        System.out.println(counter);
    }
}
