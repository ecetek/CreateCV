package com.kronProject;

public class Language extends itemCV{
    private Level level;

    public Language(String name, Level level){
        super.title=name;
        this.setLevel(level);
    }

    public int calculateKnowledge() {
        int knowlegdePoint;
        switch (getLevel()){
            case BEGINNER:
                knowlegdePoint = 20;
                break;
            case INTERMEDIATE:
                knowlegdePoint=40;
                break;
            case ADVANCE:
                knowlegdePoint=60;
                break;
            default:
                knowlegdePoint = 0;
        }
        return knowlegdePoint;
    }

    public Level getLevel() {
        //kontrolleri yap
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public String toString(){
        return String.format("Language: %s  Level: %s" ,title, getLevel());
    }
}
