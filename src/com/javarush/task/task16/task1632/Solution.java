package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Клубок
*/

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new Tread1());
        threads.add(new Tread2());
        threads.add(new Tread3());
        threads.add(new Tread4());
        threads.add(new Tread5());
    }

    public static void main(String[] args) {
    }

    public static class Tread1 extends Thread {

        @Override
        public void run() {
            while (true) {
            }
        }
    }

    public static class Tread2 extends Thread {

        @Override
        public void run() {
            try {
                throw new InterruptedException();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static class Tread3 extends Thread {

        @Override
        public void run() {
            while (true) {
                System.out.println("Ура");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static class Tread4 extends Thread implements Message {

        @Override
        public void run() {
            while (!isInterrupted()) {
            }
        }

        @Override
        public void showWarning() {
            this.interrupt();
        }
    }

    public static class Tread5 extends Thread {
        @Override
        public void run() {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int sum = 0;

            while (true) {
                try {
                    String str = reader.readLine();
                    if (str.equals("N")) {
                        break;
                    }
                    sum += Integer.parseInt(str);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(sum);
        }
    }
}