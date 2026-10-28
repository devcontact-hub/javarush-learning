package com.javarush.task.task18.task1819;

import java.io.*;

/* 
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = bufferedReader.readLine();
        String fileName2 = bufferedReader.readLine();

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try (BufferedInputStream bufferedInputStream1 = new BufferedInputStream(new FileInputStream(fileName1));
             BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(fileName2))
        ) {
            int bytesRead;
            byte[] buffer = new byte[8192];
            while ((bytesRead = bufferedInputStream2.read(buffer)) != -1) {
                byteArrayOutputStream.write(buffer, 0, bytesRead);
            }
            while ((bytesRead = bufferedInputStream1.read(buffer)) != -1) {
                byteArrayOutputStream.write(buffer, 0, bytesRead);
            }
        }
        try (BufferedOutputStream bufferedOutputStream1 = new BufferedOutputStream(new FileOutputStream(fileName1))) {
            byteArrayOutputStream.writeTo(bufferedOutputStream1);
        }
    }
}
