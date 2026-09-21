package com.javarush.task.task16.task1629;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Только по-очереди!
*/

public class Solution {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();

        //add your code here - добавьте код тут
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        t1.printResult();
        t2.printResult();
    }

    //add your code here - добавьте код тут
    public static class Read3Strings extends Thread {
        StringBuilder stringBuilder = new StringBuilder();

        @Override
        public void run() {
            String string;
            try {

                for (int i = 0; i < 3; i++) {
                    string = reader.readLine();
                    if (string != null) {
                        stringBuilder.append(string).append(" ");
                    }
                }
                stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public void printResult() {
            System.out.println(stringBuilder);
        }
    }
}
