package com.kronProject;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Experience extends itemCV {
    private Calendar startDate;
    private Calendar endDate;
    private Position position;

    public  Experience(Calendar startDate,Calendar endDate,String name,Position position){
        this.setStartDate(startDate);
        this.setEndDate(endDate);
        super.title=name;
        this.setPosition(position);

    }

    public  Experience(Calendar startDate,String name,Position position){
        this.setStartDate(startDate);
        super.title=name;
        this.setPosition(position);

    }
    public int calculateKnowledge() {
        int month;
        long diff;
        if(getEndDate() ==null){
            Date now = new Date();
            diff=now.getTime()- getStartDate().getTime().getTime();
        }else {
            diff = getEndDate().getTime().getTime() - getStartDate().getTime().getTime();
        }

        TimeUnit time=TimeUnit.DAYS;
        long difference=time.convert(diff,TimeUnit.MICROSECONDS);
        month= (int)difference/30;
        int knowlegdePoint;

        switch (getPosition()){
            case INTERN:
                knowlegdePoint = month*10;
                break;
            case JUNIOR:
                knowlegdePoint=month*20;
                break;
            case MIDDLE:
                knowlegdePoint=month*30;
                break;
            case SENIOR:
                knowlegdePoint=month*40;
                break;
            case MANAGER:
                knowlegdePoint=month*50;
                break;


            default:
                knowlegdePoint = 0;
        }
        return knowlegdePoint;
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

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public String toString(){
        SimpleDateFormat ft = new SimpleDateFormat("MM-dd-YYYY");
        
        if(getEndDate()==null){
            return String.format("Start Date: %s Title: %s  Position: %s",ft.format(getStartDate().getTime()),title,getPosition());
        }
        return String.format("Start Date: %s  End Date: %s  Title:%s Position: %s",ft.format(getStartDate().getTime()), ft.format(getEndDate().getTime()),title,getPosition());
    }
}
