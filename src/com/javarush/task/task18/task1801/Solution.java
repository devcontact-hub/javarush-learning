package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {


    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        int byteMax = -1;
        try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
            int data;
            while ((data = fileInputStream.read()) != -1) {
                if (byteMax < data) {
                    byteMax = data;
                }
            }
        }
        if (byteMax == -1) {
            System.out.println("Файл пустой");
        } else {
            System.out.println(byteMax);
        }
    }
}
