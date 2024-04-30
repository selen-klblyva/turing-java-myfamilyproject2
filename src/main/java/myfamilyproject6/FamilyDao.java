package myfamilyproject6;

import myfamilyproject2.Family;
import java.util.List;
public interface FamilyDao {
    List<Family> getAllFamilies();
    Family getFamilyByIndex(int index);
    boolean deleteFamily(int index);
    boolean deleteFamily(Family family);
    void saveFamily(Family family);

    void displayAllFamilies();

    List<Family> getFamiliesBiggerThan(int size);

    List<Family> getFamiliesLessThan(int size);

    int countFamiliesWithMemberNumber(int size);

    void createNewFamily(Human father, Human mother);

    void deleteFamilyByIndex(int index);

    Family bornChild(Family family, String masculine, String feminine);

    Family adoptChild(Family family, Human child);

    void deleteAllChildrenOlderThan(int age);

    int count();

    Family getFamilyById(int index);

    List<Pet> getPets(int familyIndex);

    void addPet(int familyIndex, Pet pet);
}
