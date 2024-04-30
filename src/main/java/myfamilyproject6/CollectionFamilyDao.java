package myfamilyproject6;

import myfamilyproject2.Family;
import java.util.ArrayList;
import java.util.List;

public class CollectionFamilyDao implements FamilyDao {
    private List<Family>families;


    public CollectionFamilyDao(){
        this.families=new ArrayList<>();
    }

    @Override
   public List<Family> getAllFamilies(){
        return families;
   }

   @Override
    public Family getFamilyByIndex(int index){
       if(index>=0 && index<families.size()){
           return families.get(index);
       }
      return null;
   }

   @Override
    public boolean deleteFamily(int index){
         if(index>=0 && index<families.size()){
              families.remove(index);
              return true;
         }
         return false;
   }

   @Override
    public boolean deleteFamily(Family family){
         return families.remove(family);
   }

   @Override
    public void saveFamily(Family family){
           families.add(family);
   }

    @Override
    public List<Family> getAllFamilies() {
        return new ArrayList<>(families);
    }

    @Override
    public void displayAllFamilies() {
        for (int i = 0; i < families.size(); i++) {
            System.out.println("Family " + i + ": " + families.get(i));
        }
    }

    @Override
    public List<Family> getFamiliesBiggerThan(int size) {
        List<Family> result = new ArrayList<>();
        for (Family family : families) {
            if (family.countFamily() > size) {
                result.add(family);
            }
        }
        return result;
    }

    @Override
    public List<Family> getFamiliesLessThan(int size) {
        List<Family> result = new ArrayList<>();
        for (Family family : families) {
            if (family.countFamily() < size) {
                result.add(family);
            }
        }
        return result;
    }

    @Override
    public int countFamiliesWithMemberNumber(int size) {
        int count = 0;
        for (Family family : families) {
            if (family.countFamily() == size) {
                count++;
            }
        }
        return count;
    }


    @Override
    public void createNewFamily(Human father, Human mother) {
        Family newFamily = new Family(father, mother);
        families.add(newFamily);
    }

    @Override
    public void deleteFamilyByIndex(int index) {
        if (index >= 0 && index < families.size()) {
            families.remove(index);
        }
    }

    @Override
    public int count() {
        return families.size();
    }

    @Override
    public Family getFamilyById(int index) {
        if (index >= 0 && index < families.size()) {
            return families.get(index);
        }
        return null;
    }

    @Override
    public List<Pet> getPets(int familyindex){
        if(familyindex>=0 && familyindex<families.size(){
            return families.get(familyindex).getPets();
        }
        return new ArrayList<>();
    }

    @Override
    public void addPet(int familyIndex, Pet pet) {
        if (familyIndex >= 0 && familyIndex < families.size()) {
            families.get(familyIndex).addPet(pet);
        }
    }



}
