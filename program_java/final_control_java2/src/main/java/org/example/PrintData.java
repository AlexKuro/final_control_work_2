package org.example;

import org.jetbrains.annotations.NotNull;
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
        String command = "command";
        String other = "other";
        String a = (String) ((JSONObject) fileJson.getData().get(s)).get(classAn);
        String b = (String) ((JSONObject) fileJson.getData().get(s)).get(breed);

        System.out.println("\t--------------------- " + i + " ---------------------");
        System.out.println("\t   Номер клейма животного: " + ((JSONObject) fileJson.getData().get(s)).get(stamp_number));
        System.out.println("\tДата регистрации карточки: " + date);
        System.out.println("\t          Класс животного: " + classAnimal(a));
        System.out.println("\t            Тип животного: " + ((JSONObject) fileJson.getData().get(s)).get(type));
        System.out.println("\t         Порода животного: " + typeAnimal(b));
        System.out.println("\t            Пол животного: " + ((JSONObject) fileJson.getData().get(s)).get(sex));
        System.out.println("\t  День рождение животного: " + ((JSONObject) fileJson.getData().get(s)).get(birthday));
        System.out.println("\t                  Команды: " + ((JSONObject) fileJson.getData().get(s)).get(command));
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

    static @NotNull String classAnimal(@NotNull String a) {
        if (a.equals("1")) {
            return "Домашние животное";
        } else if (a.equals("2")) {
            return "Вьючное животное";
        }
        return "Не определено";
    }

    static @NotNull String typeAnimal(@NotNull String a) {
        if (a.equals("1")) {
            return "Беспородная";
        } else if (a.equals("2")) {
            return "Метис";
        }
        return a;
    }
}
