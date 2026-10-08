package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1;
        String fileName2;
        try {
            fileName1 = reader.readLine();
            fileName2 = reader.readLine();
            reader.close();
            BufferedReader readerFile1 = new BufferedReader(new InputStreamReader(new FileInputStream(fileName1)));
            BufferedReader readerFile2 = new BufferedReader(new InputStreamReader(new FileInputStream(fileName2)));
            String input;
            while ((input = readerFile1.readLine()) != null) {
                allLines.add(input);
            }
            readerFile1.close();
            while ((input = readerFile2.readLine()) != null) {
                forRemoveLines.add(input);
            }
            readerFile2.close();
            new Solution().joinData();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
