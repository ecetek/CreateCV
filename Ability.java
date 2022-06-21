package com.kronProject;

public class Ability extends itemCV {
    private Level level;

    public Ability(String name,Level level){
        super.title=name;
        this.setLevel(level);
    }

    public int calculateKnowledge() {
        int knowlegdePoint;
        switch (getLevel()){
            case BEGINNER:
                knowlegdePoint = 10;
                break;
            case INTERMEDIATE:
                knowlegdePoint=20;
                break;
            case ADVANCE:
                knowlegdePoint=30;
                break;
            default:
                knowlegdePoint = 0;
        }
        return knowlegdePoint;
    }


    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public String toString(){
        return String.format("Title: %s Level: %s",title, getLevel());
    }
}
