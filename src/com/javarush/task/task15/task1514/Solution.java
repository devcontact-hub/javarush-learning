package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(1.1, "one point one");
        labels.put(2.1, "two point one");
        labels.put(5.1, "five point one");
        labels.put(5.2, "five point two");
        labels.put(5.5, "five point five");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
