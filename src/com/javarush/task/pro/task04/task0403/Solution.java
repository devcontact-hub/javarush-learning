 package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int sum = 0;
        
        Scanner console = new Scanner(System.in);
        
        boolean isEnter = false;
        
        while (!isEnter) {
            if (console.hasNextInt()) {
                int number = console.nextInt();
                sum = sum + number;
            } else if (console.hasNextLine()) {
                String line = console.nextLine();
                if (line.equals("ENTER")) {
                    isEnter = true;
                }
            }
        }
        System.out.println(sum);

    }
}