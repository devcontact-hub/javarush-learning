package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();

        int[] byteCountArray = new int[256];
        int tmp;
        try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
            while (fileInputStream.available() > 0) {
                byteCountArray[fileInputStream.read()]++;
            }
        }
        int minCount = Integer.MAX_VALUE;
        for (int byteCount : byteCountArray) {
            if (byteCount > 0 && byteCount < minCount) {
                minCount = byteCount;
            }
        }
        for (int i = 0; i < byteCountArray.length; i++) {
            if (byteCountArray[i] == minCount) {
                System.out.print(i + " ");
            }
        }
    }
}
