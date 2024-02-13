package org.example;

import org.json.simple.JSONObject;

import java.util.HashSet;
import java.util.Set;


public class PrintData implements ViewInterface {
    Set<String> setData = new HashSet<>();

    public String[] arrayKey() {
        fileJson.readFile();
        String[] s = new String[fileJson.getData().size() - 1];
        int i = 0;
        for (Object o : fileJson.getData().keySet()) {
            setData.add(o.toString());
            if (!o.toString().equals("animalCount")) {
                s[i] = o.toString();
                i++;
            }
        }
        setData.remove("animalCount");
        return s;
    }

    public void printJsonStructure(String s, Integer i) {
        String stamp_number = "stamp_number";
        String date = idUnix.current((Long) ((JSONObject) fileJson.getData().get(s)).get("date"));
        String classAn = "class";
        String type = "type";
        String breed = "breed";
        String sex = "sex";
        String birthday = "birthday";
        String other = "other";
        System.out.println("\t--------------------- " + i + " ---------------------");
        System.out.println("\t   Номер клейма животного: " + ((JSONObject) fileJson.getData().get(s)).get(stamp_number));
        System.out.println("\tДата регистрации карточки: " + date);
        System.out.println("\t          Класс животного: " + ((JSONObject) fileJson.getData().get(s)).get(classAn));
        System.out.println("\t            Тип животного: " + ((JSONObject) fileJson.getData().get(s)).get(type));
        System.out.println("\t         Порода животного: " + ((JSONObject) fileJson.getData().get(s)).get(breed));
        System.out.println("\t            Пол животного: " + ((JSONObject) fileJson.getData().get(s)).get(sex));
        System.out.println("\t  День рождение животного: " + ((JSONObject) fileJson.getData().get(s)).get(birthday));
        System.out.println("\t        Прочая информация: " + ((JSONObject) fileJson.getData().get(s)).get(other));
    }


    public void printJson() {
        String[] s = arrayKey().clone();
        for (int i = 0; i < s.length; i++) {
            int r = i + 1;
            printJsonStructure(s[i], r);
        }
        System.out.println("\t---------------------------------------------");
    }

}
