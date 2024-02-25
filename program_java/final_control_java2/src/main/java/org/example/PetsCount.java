package org.example;


public class PetsCount implements ViewInterface {
    Integer countPets;
    public Integer countPetsShow() {
        countPets = 0;
        String[] s = printData.arrayKey();
        for (String string : s) {
            if (fileJson.viewTypeData(string).equals("1")) countPets += 1;
            else pets.getDataPets().remove(string);
        }
        return countPets;
    }
}
