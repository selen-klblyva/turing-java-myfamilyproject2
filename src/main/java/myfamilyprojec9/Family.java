package myfamilyprojec9;

import java.util.List;
public class Family {
    private Human mother;
    private Human father;
    private List<Human> children;
    private List<Pet> pets;

    public Family(Human mother, Human father, List<Human> children, List<Pet> pets) {
        this.mother = mother;
        this.father = father;
        this.children =children;
        this.pets = pets;
    }

    public String prettyFormat() {
        StringBuilder sb = new StringBuilder();
        sb.append("family:\n");
        sb.append("\tmother: ").append(mother).append(",\n");
        sb.append("\tfather: ").append(father).append(",\n");
        sb.append("\tchildren:\n");
        for (Human child : children) {
            sb.append("\t\t").append(child).append("\n");
        }
        sb.append("\tpets: ").append(pets).append("\n");
        return sb.toString();
    }
}