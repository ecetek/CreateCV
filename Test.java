package com.kronProject;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Test {
    public static void main(String args[])  //static method
    {
        Person ece = new Person("Ece","Tek","+905350643899","ecetek_@outlook.com");
        CV eceCV = new CV(ece,"I love being part of development!");
        eceCV.addItemCV(new Ability("Java", Level.INTERMEDIATE));
        eceCV.addItemCV(new Ability("Python", Level.INTERMEDIATE));
        eceCV.addItemCV(new Ability("Team Work", Level.ADVANCE));
        eceCV.addItemCV(new Ability("Theatre", Level.ADVANCE));
        eceCV.addItemCV(new Language("English",Level.INTERMEDIATE));
        eceCV.addItemCV(new Language("German",Level.BEGINNER));
        eceCV.addItemCV(new Education(new GregorianCalendar(2013,9,16),new GregorianCalendar(2017, 6,17),"Icel Anatolian Highschool",88,"Mathematic"));
        eceCV.addItemCV(new Education(new GregorianCalendar(2018, 9,21),"Ege University",91,"Computer Engineering"));
        eceCV.addItemCV(new Experience(new GregorianCalendar(2021, 8,8),new GregorianCalendar(2021,Calendar.SEPTEMBER,15),"QNB FINANSBANK",Position.INTERN));
        eceCV.addItemCV(new Experience(new GregorianCalendar(2022, 1,19),"YAPI KREDİ TECHNOLOGY",Position.INTERN));
        System.out.println(eceCV);


    }
}
