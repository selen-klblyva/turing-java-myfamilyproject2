package myfamilyproject6;

import myfamilyproject2.Family;

public class FamilyController {
    private FamilyService familyService;

    public FamilyController(FamilyService familyService) {
        this.familyService = familyService;
    }


    public Family bornChild(Family family, String masculine, String feminine) {
        Family updatedFamily = familyDao.bornChild(family, masculine, feminine);
        familyDao.saveFamily(updatedFamily);
        return updatedFamily;
    }
    public Family adoptChild(Family family, Human child) {
        Family updatedFamily = familyDao.adoptChild(family, child);
        familyDao.saveFamily(updatedFamily);
        return updatedFamily;
    }

    public void deleteAllChildrenOlderThan(int age) {
        familyDao.deleteAllChildrenOlderThan(age);
    }

}
