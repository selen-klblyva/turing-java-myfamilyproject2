package myfamilyproject3;
import java.util.Arrays;
import java.util.Objects;

/* public class Family {
    private Human mother;
    private Human father;
    private Human children[];
    private Pet pet;
    public Family(Human mother, Human father) {
        if (mother == null && father == null) {
            System.out.println("there is no mother and father");
        } else {
            this.mother = mother;
            this.father = father;
            this.children = new Human[0];
        }
    }
    public Human getMother() {
        return mother;
    }
    public void setMother(Human mother) {
        this.mother = mother;
    }
    public Human getFather() {
        return father;
    }
    public void setFather(Human father) {
        this.father = father;
    }
    public Human[] getChildren() {
        return children;
    }
    public void setChildren(Human[] children) {
        this.children = children;
    }
    public Pet getPet() {
        return pet;
    }
    public void setPet(Pet pet){
        this.pet=pet;
    }

    public void addChild(Human child) {
        if (child == null) {
            System.out.println(("Family don't have any child yet"));
        } else {
            this.children = Arrays.copyOf(this.children, this.children.length + 1);
            this.children[this.children.length - 1] = child;
            child.setFamily(this);
        }
    }

    public boolean deleteChild(Human child) {
        if (child == null) {
            return false;
        }
        if (this.children.length == 0) {
            System.out.println("Family has no children to delete.");
            return false;
        }
        int index = -1;
        for (int i = 0; i < this.children.length; i++) {
            if (this.children[i].equals(child)) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Child not found in the family.");
            return false;
        }
        Human removedChild = this.children[index];
        for (int i = index; i < this.children.length - 1; i++) {
            this.children[i] = this.children[i + 1];
        }

        this.children = Arrays.copyOf(this.children, this.children.length - 1);
        if (removedChild != null) {
            removedChild.setFamily(null);
            System.out.println("Child object successfully removed.");
            countFamily();
            return true;
        } else {
            return false;
        }
    }
    public int countFamily() {
        int count = 2;
        count += this.children.length;
        return count;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("A family member is being removed before garbage collection.");
        super.finalize();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return Objects.equals(mother, family.mother) && Objects.equals(father, family.father) && Arrays.equals(children, family.children) && Objects.equals(pet, family.pet);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(mother, father, pet);
        result = 31 * result + Arrays.hashCode(children);
        return result;
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +
                ", father=" + father +
                ", children=" + Arrays.toString(children) +
                ", pet=" + pet +
                '}';
    }
}

 */
