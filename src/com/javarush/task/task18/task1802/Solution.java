package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        int byteMin = 256;
        try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
            int data;
            while ((data = fileInputStream.read()) != -1) {
                if (byteMin > data) {
                    byteMin = data;
                }
            }
        }

        if (byteMin == 256) {
            System.out.println("Файл пустой");
        } else {
            System.out.println(byteMin);
        }
    }
}
