package com.javarush.task.task15.task1501;

/* 
ООП - Расставь интерфейсы
*/

public class Solution {
    public static void main(String[] args) {

    }

    public interface Movable {
        boolean isMovable();
    }

    public interface Sellable {
        Object getAllowedAction(String name);
    }

    public interface Discountable {
        Object getAllowedAction();
    }

    public static class Clothes implements Movable, Sellable, Discountable {
        @Override
        public Object getAllowedAction() {
            return 100;
        }

        @Override
        public boolean isMovable() {
            return true;
        }

        @Override
        public Object getAllowedAction(String name) {
            return "selle";
        }
    }
}
