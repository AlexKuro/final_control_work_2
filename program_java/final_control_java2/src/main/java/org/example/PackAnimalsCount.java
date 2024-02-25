package org.example;

public class PackAnimalsCount implements ViewInterface {
    Integer countPackAnimals;

    public Integer countPackAnimalsShow() {
        countPackAnimals = 0;
        String[] s = printData.arrayKey();
        for (String string : s) {
            if (fileJson.viewTypeData(string).equals("2")) countPackAnimals += 1;
            else packAnimals.getDataPack().remove(string);
        }
        return countPackAnimals;
    }
}
