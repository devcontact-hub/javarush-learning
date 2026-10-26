package com.javarush.task.task18.task1817;

import java.io.FileReader;
import java.io.IOException;

/* 
Пробелы
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int count = 0;
        int space = 0;
        try (FileReader fileReader = new FileReader(args[0])) {
            int character;
            while ((character = fileReader.read()) != -1) {
                char ch = (char) character;
                count++;
                if (ch == ' ') {
                    space++;
                }
            }
        }
        double result = (double) space / count * 100;
        System.out.printf("%.2f%n", result);
    }
}
