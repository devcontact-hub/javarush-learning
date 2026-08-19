package com.javarush.task.pro.task02.task0214;

import java.util.Scanner;

/* 
Чтение и преобразование строк
*/

public class Solution {

    public static void main(String[] args) 
    {
      Scanner console = new Scanner(System.in);  //напишите тут ваш код
      String a = console.nextLine();
      String b = console.nextLine();
      String c = console.nextLine();
      
      String a2 = a.toLowerCase();
      String b2 = b.toUpperCase();
      
      System.out.println(c);
      System.out.println(b2);
      System.out.println(a2);
      

    }
}
