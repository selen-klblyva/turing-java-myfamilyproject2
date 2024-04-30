package myfamilyproject2;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
import java.util.HashMap;
import java.util.Map;
public abstract class Human {
    private String name;
    private String surname;
    private int yearofBirth;
    private int iq;
    private Map<String,String> schedule;
    private Family family;

    public Human(String name,String surname,int yearofBirth,int iq,Map<String,String> schedule){
        this.name=name;
        this.surname=surname;
        this.yearofBirth=yearofBirth;
        this.iq=iq;
        this.schedule=new HashMap<>();
    }


    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setSurname(String surname){
        this.surname=surname;
    }
    public String getSurname(){
        return this.surname;
    }

    public void setYearofBirth(int yearofBirth){
        this.yearofBirth=yearofBirth;
    }
    public int getYearofBirth(){
        return this.yearofBirth;
    }
    public void setIq(int iq){
        this.iq=iq;
    }
    public int getIq(){
        return this.iq;
    }
    public void setFamily(Family family){
        this.family=family;
    }
    public Family getFamily(){
        return this.family;
    }

    public void setSchedule(Map<String,String> Schedule) {
        this.schedule=schedule;
    }
    public Map<String,String> getSchedule(){
        return this.schedule;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", yearofBirth=" + yearofBirth +
                ", iq=" + iq +
                ", schedule=" + schedule +
                ", family=" + family +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return yearofBirth == human.yearofBirth && iq == human.iq && Objects.equals(name, human.name) && Objects.equals(surname, human.surname) && Objects.equals(schedule, human.schedule) && Objects.equals(family, human.family);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, yearofBirth, iq, schedule, family);
    }
}
