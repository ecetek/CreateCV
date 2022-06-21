package com.kronProject;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Education extends itemCV{
    private Calendar startDate;
    private Calendar endDate;
    private double avarage;
    private String majorArea;


    public  Education(Calendar startDate,Calendar endDate,String schoolName,double avarage,String majorArea){
        this.setStartDate(startDate);
        this.setEndDate(endDate);
        super.title=schoolName;
        this.setAvarage(avarage);
        this.setMajorArea(majorArea);

    }

    public  Education(Calendar startDate,String schoolName,double avarage,String majorArea){
        this.setStartDate(startDate);
        super.title=schoolName;
        this.setAvarage(avarage);
        this.setMajorArea(majorArea);
    }

    public int calculateKnowledge(){
        int avarage1=(int) getAvarage();
        return avarage1;
    }


    public Calendar getStartDate() {
        return startDate;
    }

    public void setStartDate(Calendar startDate) {
        this.startDate = startDate;
    }

    public Calendar getEndDate() {
        return endDate;
    }

    public void setEndDate(Calendar endDate) {
        this.endDate = endDate;
    }

    public double getAvarage() {
        return avarage;
    }

    public void setAvarage(double avarage) {
        this.avarage = avarage;
    }

    public String getMajorArea() {
        return majorArea;
    }

    public void setMajorArea(String majorArea) {
        this.majorArea = majorArea;
    }

    public String toString(){
        SimpleDateFormat ft = new SimpleDateFormat("MM-dd-YYYY");

        if(getEndDate()==null){
            return String.format("Start Date:%s, Avarage:%s, Major Area:%s",ft.format(getStartDate().getTime()),getAvarage(),getMajorArea());

        }
        return String.format("Start Date:%s, End Date:%s, Avarage:%s, Major Area:%s",ft.format(getStartDate().getTime()), ft.format(getEndDate().getTime()),getAvarage(),getMajorArea());
    }
}
