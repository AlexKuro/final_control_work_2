package org.example;

import java.util.HashMap;
import java.util.Map;
//import java.util.Random;


public class Animal implements ViewInterface {

    public void addAnimal() {
        Map<String, Object> dataS = new HashMap<>();
        long id = idUnix.id();
        long date = idUnix.date();
        String nameKey = "animal_" + id;
        dataS.put("stamp_number", id);          // номер клейма
        dataS.put("date", date);                // дата регистрации карточки
        dataS.put("class", SCANS.scan_2());     // класс животного: домашнее, вьючное
        dataS.put("type", SCANS.scan_3());      // тип животного
        dataS.put("breed", SCANS.scan_4());     // порода животного
        dataS.put("sex", SCANS.scan_5());       // пол животного
        dataS.put("birthday", SCANS.scan_6());  // день рождение животного
        dataS.put("other", SCANS.scan_7());     // прочая информация
        fileJson.addJson(nameKey, dataS);
    }

    public void delAnimal() {
        String[] s = printData.arrayKey().clone();
        int delNum = Integer.parseInt(SCANS.scan_10(s.length)) - 1;
        if (delNum != -1) {
            fileJson.getData().remove(s[delNum]);
            fileJson.delJson();
        }
    }
}
