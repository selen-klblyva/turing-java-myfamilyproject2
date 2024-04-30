package myfamilyproject7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public abstract class Human {
    private String name;
    private String surname;
    private long birthDate;
    private int iq;
    private Map<String, String> schedule;
    private Family family;

    public Human(String name, String surname, long birthDate, int iq, Map<String, String> schedule,Family family) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.iq = iq;
        this.schedule = new HashMap<>(schedule);
        this.family=family;
    }

    public Human(String name, String surname, String birthDateString, int iq, Map<String, String> schedule) throws ParseException {
        this.name = name;
        this.surname = surname;
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date date = sdf.parse(birthDateString);
        this.birthDate = date.getTime();
        this.iq = iq;
        this.schedule = new HashMap<>(schedule);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setBirthDate(long birthDate) {
        this.birthDate = birthDate;
    }

    public long getBirthDate() {
        return this.birthDate;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public int getIq() {
        return this.iq;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public Family getFamily() {
        return this.family;
    }

    public void setSchedule(Map<String, String> schedule) {
        this.schedule = schedule;
    }

    public Map<String, String> getSchedule() {
        return this.schedule;
    }

    public String describeAge() {
        long currentTime = System.currentTimeMillis();
        long ageInMillis = currentTime - birthDate;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(ageInMillis);

        int years = calendar.get(Calendar.YEAR) - 1970;
        int months = calendar.get(Calendar.MONTH);
        int days = calendar.get(Calendar.DAY_OF_MONTH) - 1;

        return String.format("%d years, %d months, %d days", years, months, days);
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date birthDateObj = new Date(birthDate);
        String birthDateString = sdf.format(birthDateObj);
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthDate=" + birthDateString +
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
        return birthDate == human.birthDate && iq == human.iq && Objects.equals(name, human.name) && Objects.equals(surname, human.surname) && Objects.equals(schedule, human.schedule) && Objects.equals(family, human.family);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, birthDate, iq, schedule, family);
    }
}