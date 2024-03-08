package myfamilyproject2;

import java.util.Arrays;
import java.util.Objects;
import java.util.Random;
public abstract class Human {
    private String name;
    private String surname;
    private int yearofBirth;
    private int iq;
    private String[][] schedule;
    private Family family;

    public Human(String name,String surname,int yearofBirth,int iq,String[][] schedule){
        this.name=name;
        this.surname=surname;
        this.yearofBirth=yearofBirth;
        this.iq=iq;
        this.schedule=schedule;
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

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", yearofBirth=" + yearofBirth +
                ", iq=" + iq +
                ", schedule=" + Arrays.toString(schedule) +
                ", family=" + family +
                '}';
    }







}
