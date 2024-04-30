package myfamilyprojec8;

import myfamilyproject2.Family;
import myfamilyproject6.FamilyDao;

import java.util.List;
import java.util.stream.Collectors;

public class FamilyService {
    private FamilyDao familyDao;

    public FamilyService(FamilyDao familyDao) {
        this.familyDao = familyDao;
    }

    public void displayAllFamilies() {
        familyDao.getAllFamilies().forEach(family -> System.out.println(family));
    }


    public List<Family> getFamiliesBiggerThan(int size) {
        return familyDao.getAllFamilies().stream()
                .filter(family -> family.countFamily() > size)
                .collect(Collectors.toList());
    }

    public List<Family> getFamiliesLessThan(int size) {
        return familyDao.getAllFamilies().stream()
                .filter(family -> family.countFamily() < size)
                .collect(Collectors.toList());
    }

    public int countFamiliesWithMemberNumber(int size) {
        return (int) familyDao.getAllFamilies().stream()
                .filter(family -> family.countFamily() == size)
                .count();
    }


    public void deleteAllChildrenOlderThan(int age) {
        familyDao.getAllFamilies().forEach(family -> familyDao.deleteAllChildrenOlderThan(age));
    }


}