package com.javarush.task.pro.task04.task0417;

import java.util.Scanner;

/* 
Скорость ветра
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner console = new Scanner(System.in);
        int mc = console.nextInt();
        int kmch = (int) Math.round(mc * 3.6);
        System.out.println(kmch);

    }
}