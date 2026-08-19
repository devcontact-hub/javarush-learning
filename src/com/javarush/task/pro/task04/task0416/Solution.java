package com.javarush.task.pro.task04.task0416;

import java.util.Scanner;

/* 
Share a Coke
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner console = new Scanner(System.in);
        
        int firstNumber = console.nextInt();
        int secondNumber = console.nextInt();
        
        double result = firstNumber * 1. / secondNumber;
        System.out.println(result);
    }
}