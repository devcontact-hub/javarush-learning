package com.javarush.task.task18.task1808;

import java.io.*;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        String fileName1 = bufferedReader.readLine();
        String fileName2 = bufferedReader.readLine();

        try (FileInputStream fileInputStream = new FileInputStream(fileName);
             FileOutputStream fileOutputStream1 = new FileOutputStream(fileName1);
             FileOutputStream fileOutputStream2 = new FileOutputStream(fileName2)) {

            int halfOfFile = (fileInputStream.available() + 1) / 2;
            byte[] buffer = new byte[halfOfFile];
            int count = fileInputStream.read(buffer);
            fileOutputStream1.write(buffer, 0, count);
            count = fileInputStream.read(buffer);
            fileOutputStream2.write(buffer, 0, count);
        }
    }
}