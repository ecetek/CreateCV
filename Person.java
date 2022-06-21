package com.kronProject;

public class Person {
    private String name;
    private String surName;
    private String telephoneNumber;
    private String e_mail;


    public Person(String name,String surName,String telephoneNumber,String e_mail){
        this.setName(name);
        this.setSurName(surName);
        this.setTelephoneNumber(telephoneNumber);
        this.setE_mail(e_mail);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }
    public String toString(){
        return String.format("Name: %s, Surname: %s, Phone Number: %s, E-Mail: %s",getName(), getSurName(),getTelephoneNumber(),getE_mail());
    }
}
