package com.javarush.task.pro.task10.task1025;

/* 
Взлом ретранслятора
*/

public class Solution {

    public static void main(String[] args) {
        //напишите тут ваш код
        Repeater repeater = new Repeater();

        if (!(repeater.getTrajectory().equalsIgnoreCase("elliptic"))) {
            repeater.setTrajectory("elliptic");
        }

        if (repeater.getFrequency() < 100) {
            repeater.setFrequency(repeater.getFrequency() * 10);
        }

        System.out.println(repeater.toString());
    }
}