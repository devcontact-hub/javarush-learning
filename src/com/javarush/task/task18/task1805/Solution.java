package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();

        int tmp;
        Set<Integer> bytes = new TreeSet<>();
        try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
            while ((tmp = fileInputStream.read()) != -1) {
                bytes.add(tmp);
            }
        }
        for (Integer integer : bytes) {
            System.out.print(integer + " ");
        }
    }
}
