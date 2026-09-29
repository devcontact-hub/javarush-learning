package com.javarush.task.task17.task1711;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    static SimpleDateFormat inputFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    static SimpleDateFormat outputFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

    public static void main(String[] args) throws Exception {
        //start here - начни тут
        if (args == null || args.length < 1) {
            throw new RuntimeException("Нет входных аргументов");
        }

        try {
            switch (args[0]) {
                case "-c" :
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length; i += 3) {
                            String name = args[i];
                            String sex = args[i + 1];
                            Date birdDate = inputFormat.parse(args[i + 2]);
                            Person person =
                                    sex.equals("м") ? Person.createMale(name, birdDate) : Person.createFemale(name, birdDate);
                            allPeople.add(person);
                            System.out.println(allPeople.indexOf(person));
                        }
                    }
                    break;
                case "-u" :
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length; i += 4) {
                            int id = Integer.parseInt(args[i]);
                            String name = args[i + 1];
                            String sex = args[i + 2];
                            Date birdDate = inputFormat.parse(args[i + 3]);
                            Person person = allPeople.get(id);
                            if (person == null) {
                                throw new IllegalArgumentException("Нет такого номера id в списке");
                            }
                            person.setName(name);
                            person.setSex(sex.equals("м") ? Sex.MALE : Sex.FEMALE);
                            person.setBirthDate(birdDate);
                        }
                    }
                    break;
                case "-d" :
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length; i++) {
                            int id = Integer.parseInt(args[i]);
                            Person person = allPeople.get(id);
                            if (person == null) {
                                throw new IllegalArgumentException("Нет такого номера id в списке");
                            }
                            person.setName(null);
                            person.setSex(null);
                            person.setBirthDate(null);
                        }
                    }
                    break;
                case "-i" :
                    synchronized (allPeople) {
                        for (int i = 1; i < args.length; i++) {
                            int id = Integer.parseInt(args[i]);
                            Person person = allPeople.get(id);
                            if (person == null) {
                                throw new IllegalArgumentException("Нет такого номера id в списке");
                            }
                            String name = person.getName();
                            String sex = person.getSex() == Sex.MALE ? "м" : "ж";
                            Date birdDate = person.getBirthDate();
                            System.out.println(name + " " + sex + " " + outputFormat.format(birdDate));
                        }
                    }
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
