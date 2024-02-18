package org.example;

public class ViewSign {

    public String SignField(Integer n) {
        String s = "";
        if (n == 0) s = "\t-  Главное меню  - ";
        if (n == 1) s = "\t-  Добавление животного  - ";
        if (n == 2) s = "\t-  Список животных  - ";
        if (n == 4) s = "\t-  Удаление записи  - ";
        if (n == 5) s = "\t-  Обучение командам  - ";
        if (n == 6) s = "\t- - - - -  - - Первый этап.- - - - -  - - ";
        if (n == 7) s = "\t- - - - -  - - Второй этап.- - - - -  - - ";
        return s;
    }

}
