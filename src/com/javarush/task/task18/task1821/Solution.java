package com.javarush.task.task18.task1821;

import java.io.FileReader;
import java.io.IOException;

/* 
Встречаемость символов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] aSCII = new int[128];

        try (FileReader reader = new FileReader(args[0])) {
            int code;
            while ((code = reader.read()) != -1) {
                aSCII[code]++;
            }
        }
        for (int i = 0; i < aSCII.length; i++) {
            if (aSCII[i] != 0) {
                System.out.println((char) i + " " + aSCII[i]);
            }
        }
    }
}
