package myfamilyprojec9;

import java.util.List;
import java.util.ArrayList;
public class FamilyService {

    private List<Family> families;

    public FamilyService() {
        this.families = new ArrayList<>();
    }

    public void addFamily(Family family) {
        families.add(family);
    }

    public void displayAllFamilies() {
        for (int i = 0; i < families.size(); i++) {
            System.out.println("Family " + (i + 1) + ":");
            System.out.println(families.get(i).prettyFormat());
        }
    }


}
