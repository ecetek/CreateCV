//import com.sun.org.slf4j.internal.Logger;
//import com.sun.org.slf4j.internal.LoggerFactory;
package com.kronProject;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Supplier;


public class CV {
    //private static final Logger log = LoggerFactory.getLogger(CV.class);

    private Person person;
    private String aboutMe;
    private HashSet<Education> educationInfo = new HashSet<Education>();//aynı bilgi tek seferde tutulur
    private HashSet<Ability> abilityInfo = new HashSet<Ability>();
    private HashSet<Experience> experienceInfo = new HashSet<Experience>();
    private HashSet<Language> languageInfo = new HashSet<Language>();
    int totalKnowledgePoint;

    public CV(Person person,String aboutMe){//constructor
        this.setPerson(person);
        this.setAboutMe(aboutMe);
        totalKnowledgePoint=0;

    }

    public void addItemCV(itemCV item){
        if (item instanceof Education){
            educationInfo.add((Education) item);
        }
        else if(item instanceof  Ability){
            abilityInfo.add((Ability) item);
        }else if(item instanceof  Experience){
            experienceInfo.add((Experience) item);
        }else if(item instanceof Language){
            languageInfo.add((Language) item);
        }else {
            return;
        }

        totalKnowledgePoint+=item.calculateKnowledge();
    }

    public void findStrongestSuit(){
        Optional<Experience> maxExperiencePoint = experienceInfo.stream().max(Comparator.comparing(Experience::calculateKnowledge));
        //maxExperiencePoint.orElseGet();
        //OptionalInt maxKnowlegdePoint = experienceInfo.stream().mapToInt(Experience::calculateKnowledge).max();

    }

    public String toString(){
        //findStrongestSuit();
        String result=getPerson().toString() + "\n" + getAboutMe() + "\n";
        result += "Knowledge Point: " + totalKnowledgePoint + "\n";

        result += "ABILITIES\n---------\n";
        for(Ability ability:abilityInfo){
            result += "\t" + ability.toString() + "\n";
        }
        result += "EXPERIENCES\n-----------\n";
        for(Experience experience:experienceInfo){
            result += "\t" + experience.toString() + "\n";
        }

        result += "EDUCATION\n---------\n";
        for(Education education:educationInfo){
            result += "\t" + education.toString() + "\n";
        }

        result += "LANGUAGES\n---------\n";
        for(Language language:languageInfo){
            result += "\t" + language.toString() + "\n";
        }

        return result;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getAboutMe() {
        return aboutMe;
    }

    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }
}
