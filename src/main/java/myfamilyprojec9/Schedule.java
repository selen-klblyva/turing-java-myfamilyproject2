package myfamilyprojec9;


import java.util.Map;
import java.util.HashMap;

public class Schedule {
    private Map<String, String> schedule;

    public Schedule() {
        this.schedule = new HashMap<>();
    }

    public void addActivity(String day, String activity) {
        schedule.put(day, activity);
    }

    @Override
    public String toString() {
        return schedule.toString();
    }
}
