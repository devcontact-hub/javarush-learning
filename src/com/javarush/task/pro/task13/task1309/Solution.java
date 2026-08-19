package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        //напишите тут ваш код
        grades.put("Скамейкин Сергей", 3.1);
        grades.put("Пупкин Василий", 4.3);
        grades.put("Сидоров Егор", 4.1);
        grades.put("Петров Петр", 3.9);
        grades.put("Киану Ривз", 5.0);
    }
}
