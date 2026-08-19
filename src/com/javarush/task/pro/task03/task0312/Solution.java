package com.javarush.task.pro.task03.task0312;

import java.util.Scanner;

/* 
Сравним строки
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner console = new Scanner(System.in);
        String nime1 = console.nextLine();
        String nime2 = console.nextLine();
        
        if (nime1.equals(nime2))
        System.out.println("строки одинаковые");
        else //напишите тут ваш код
        System.out.println("строки разные");
    }
}
