package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Formalyukov Sergey Alexandrovich");
        student.setGroup("ATM-11");
        student.setAdmission(new Date());
        System.out.println("Students fullname :" + student.getFullName() + System.lineSeparator()
                + "group : " + student.getGroup() + System.lineSeparator() + "date of admission : " + student.getAdmission());
    }
}