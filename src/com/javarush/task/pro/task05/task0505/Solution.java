package com.javarush.task.pro.task05.task0505;

import java.util.Scanner;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) {

        //напишите тут ваш код
        Scanner console = new Scanner(System.in);

        int n = console.nextInt();

        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = console.nextInt();
        }

        if (n % 2 == 0) {
            for (int i = data.length - 1; i >= 0; i--) {
                System.out.println(data[i]);
            }
        } else {
            for (int i = 0; i < data.length; i++) {
                System.out.println(data[i]);
            }
        }
    }
}