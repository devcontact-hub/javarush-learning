package com.javarush.task.task17.task1710;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    static SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    static SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        if (args == null || args.length < 1) {
            throw new RuntimeException("Нет входных аргументов");
        }

        Date birthdayDate;
        Person person;

        switch (args[0]) {
            case "-c" :
                birthdayDate = simpleDateFormat1.parse(args[3]);

                if (args[2].equals("м")) {
                    person = Person.createMale(args[1], birthdayDate);
                } else {
                    person = Person.createFemale(args[1], birthdayDate);
                }

                allPeople.add(person);
                System.out.println(allPeople.size() - 1);
                break;
            case "-r" :
                person = allPeople.get(Integer.parseInt(args[1]));
                if (person != null) {
                    System.out.println(person.getName() + " " + (person.getSex() == Sex.MALE ? "м" : "ж") + " " + simpleDateFormat2.format(person.getBirthDate()));
                }
                break;
            case "-u" :
                birthdayDate = simpleDateFormat1.parse(args[4]);
                int id = Integer.parseInt(args[1]);
                person = allPeople.get(id);
                if (person == null) {
                    throw new IllegalArgumentException("Нет такого номера id в списке");
                }
                person.setName(args[2]);
                person.setSex(args[3].equals("м") ? Sex.MALE : Sex.FEMALE);
                person.setBirthDate(birthdayDate);
                break;
            case "-d" :
                Person currentPerson = allPeople.get(Integer.parseInt(args[1]));
                currentPerson.setName(null);
                currentPerson.setSex(null);
                currentPerson.setBirthDate(null);
                break;
        }
    }
}
