package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.ArrayList;

/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileInput;
        String fileOutput;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            fileInput = reader.readLine();
            fileOutput = reader.readLine();
        }

        try (FileReader fileReader = new FileReader(fileInput);
             FileWriter fileWriter = new FileWriter(fileOutput)) {
            int ch;
            int count = 1;
            while ((ch = fileReader.read()) != -1) {
                if (count % 2 == 0) {
                    fileWriter.write(ch);
                }
                count++;
            }
        }

    }
}
