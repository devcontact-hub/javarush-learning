package com.javarush.task.pro.task05.task0524;

/*
Найти минимальный элемент в массиве
 */
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int[] array = new int[10];
        for (int i = 0; i <10; i++) {
            array[i] = console.nextInt();   // вводим с клавиатуры 10 элементов массива
        }

        int min = array[0]; //присваиваем минимальному значению первый элемент массива

        for (int i = 1; i < 10; i++) { //находим минимальное значение из массива
            if (array[i] < min)
                min = array[i];
        }
        System.out.println(min);
    }
}