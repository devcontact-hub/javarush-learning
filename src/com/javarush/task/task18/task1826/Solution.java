package com.javarush.task.task18.task1826;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
Шифровка
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        if (args.length < 3) {
            return;
        }

        if (!(args[0].equals("-e") || args[0].equals("-d"))) {
            return;
        }

        try (FileInputStream fileInputStream = new FileInputStream(args[1]);
             FileOutputStream fileOutputStream = new FileOutputStream(args[2])) {

            int data;
            if (args[0].equals("-e")) {
                while ((data = fileInputStream.read()) != -1) {
                    fileOutputStream.write(data + 100);
                }
            } else {
                while ((data = fileInputStream.read()) != -1) {
                    fileOutputStream.write(data - 100);
                }
            }
        }
    }

}
