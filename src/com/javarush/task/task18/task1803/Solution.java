package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();

        int[] byteCountArray = new int[256];
        int tmp;
        try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
            while ((tmp = fileInputStream.read()) != -1) {
                byteCountArray[tmp] += 1;
            }
        }
        int maxCount = 0;
        for (int byteCount : byteCountArray) {
            if (byteCount > maxCount) {
                maxCount = byteCount;
            }
        }
        for (int i = 0; i < byteCountArray.length; i++) {
            if (byteCountArray[i] == maxCount) {
                System.out.print(i + " ");
            }
        }
    }
}
