package org.example;

import java.util.Map;
import java.util.TreeMap;

/**
 * Класс реализует:
 * - добавления новой карточки животного в общий файл
 * - удаление карточки животного из общего файла
 */
public class Animal implements ViewInterface {
    /**
     * Метод addAnimal
     * - добавления новой карточки животного в общий файл
     *
     * @return Ничего.
     */
    public void addAnimal() {
        do {
            Map<String, Object> dataS = new TreeMap<>();
            long id = idUnix.id();
            long date = idUnix.date();
            String nameKey = "animal_" + id;
            dataS.put("stamp_number", id);          // номер клейма
            dataS.put("date", date);                // дата регистрации карточки
            dataS.put("class", scans.scan_2());     // класс животного: домашнее, вьючное
            dataS.put("type", scans.scan_3());      // тип животного
            dataS.put("breed", scans.scan_4());     // порода животного
            dataS.put("sex", scans.scan_5());       // пол животного
            dataS.put("birthday", scans.scan_6());  // день рождение животного
            dataS.put("command", scans.scan_9());   // команды
            dataS.put("other", scans.scan_7());     // прочая информация
            fileJson.AddWriteFile(nameKey, dataS);
            if (fileJson.getFlagFillingErrorList()) {
                if (scans.scan_8().equals("2")) fileJson.setFlagFillingErrorList(false);
            }
        } while (fileJson.getFlagFillingErrorList());
    }

    /**
     * Метод delAnimal
     * - удаление карточки животного из общего файла
     *
     * @return Ничего.
     */
    public void delAnimal() {
        String[] s = printData.arrayKey().clone();
        int delNum = Integer.parseInt(scans.scan_10(s.length)) - 1;
        if (delNum != -1) {
            fileJson.getData().remove(s[delNum]);
            fileJson.delJson();
        }
    }
}
