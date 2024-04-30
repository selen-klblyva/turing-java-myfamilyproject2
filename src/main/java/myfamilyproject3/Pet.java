package myfamilyproject3;
import java.util.Arrays;
import java.util.Objects;

public class Pet {

    private String name;
    private Species species;

    public Pet(String name,Species species){
        this.name=name;
        this.species=species;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", species=" + species +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return Objects.equals(name, pet.name) && species == pet.species;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, species);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("A pet member is being removed before garbage collection.");
        super.finalize();
    }

}
