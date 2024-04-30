package myfamilyprojec9;

import java.util.List;
public class Pet {
    private String species;
    private String nickname;
    private int age;
    private int trickLevel;
    private List<String> habits;

    public Pet(String species, String nickname, int age, int trickLevel, List<String> habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    @Override
    public String toString() {
        return "{species=" + species + ", nickname='" + nickname + "', age=" + age + ", trickLevel=" + trickLevel + ", habits=" + habits + "}";
    }
}
