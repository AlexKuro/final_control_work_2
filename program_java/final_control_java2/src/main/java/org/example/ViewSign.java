package org.example;

public class ViewSign {

    public String SignField(Integer n) {
        String s = "";
        if (n == 0) s = "\t-  Главное меню  - ";
        if (n == 1) s = "\t-  Добавление животного  - ";
        if (n == 2) s = "\t-  Список животных  - ";
        if (n == 4) s = "\t-  Удаление записи  - ";
        return s;
    }
}
