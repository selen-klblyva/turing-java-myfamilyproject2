package myfamilyprojec9;

public class Human {
    private String name;
    private String surname;
    private String birthDate;
    private int iq;
    private Schedule schedule;

    public Human(String name, String surname, String birthDate, int iq, Schedule schedule) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.iq = iq;
        this.schedule = schedule;
    }

    @Override
    public String toString() {
        return "{name='" + name + "', surname='" + surname + "', birthDate='" + birthDate + "', iq=" + iq + ", schedule=" + schedule + "}";
    }
}
