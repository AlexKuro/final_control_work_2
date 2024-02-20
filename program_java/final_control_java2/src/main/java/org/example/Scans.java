package org.example;

import org.jetbrains.annotations.NotNull;


public class Scans implements ViewInterface {

    public Integer scan_1() {
        boolean fl = true;
        String checkS;
        Integer checkI = null;
        do {
            System.out.print("\nВведите число -> ");
            checkS = stringScanner.nextLine();
            if (!checkS.matches("[12349]")) {
                System.out.print("\tВведено неверное значение.");
            } else {
                checkI = Integer.valueOf(checkS);
                fl = false;
            }
        } while (fl);
        return checkI;
    }

    public Integer scan_0() {
        boolean fl = true;
        String checkS;
        Integer checkI = null;
        do {
            System.out.print("\nВведите число -> ");
            checkS = stringScanner.nextLine();
            if (!checkS.matches("[19]")) {
                System.out.println("\tВведено неверное значение.");
            } else {
                checkI = Integer.valueOf(checkS);
                fl = false;
            }
        } while (fl);
        return checkI;
    }

    public String scan_2() {
        System.out.println("1. К какому классу относится животное?");
        System.out.println("\tДомашние животные - - - - - - - - нажмите '1'");
        System.out.println("\tВьючные животные  - - - - - - - - нажмите '2'");
        System.out.print("Введите число -> ");
        // нужна проверка
        String check = stringScanner.nextLine();
        if (!check.matches("[12]")) {
            String s = "- Класс задан не верно. Необходимо ввести число '1' или '2'. Введено: " + check + "\n";
            fileJson.setFillingErrorList(s);
        }
        return check;
    }

    public String scan_3() {
        System.out.print("2. Введите тип животного (собака, кошка, лошадь ...) -> ");
        String check = stringScanner.nextLine();
        if (check.length() < 2) {
            String s = "- Тип животного задан не верно. Введено: " + check + "\n";
            fileJson.setFillingErrorList(s);
        }
        return check;
    }

    public String scan_4() {
        System.out.print("3. Порода животного:");
        System.out.print("""
                 Если информация о точной разновидности отсутствует,
                 \tукажите 'Беспородная', при смешанной породе укажите 'Метис'.
                """);
        System.out.println("\tДля быстрого ввода можно ввести цифры:");
        System.out.println("\tБеспородная - - - - - - - - - - - нажмите '1'");
        System.out.println("\tМетис - - - - - - - - - - - - - - нажмите '2'");
        System.out.print("Введите породу животного -> ");
        String check = stringScanner.nextLine();
        if (!(check.matches("[12]"))) {
            if (check.length() < 3) {
                String s = "- Порода животного задана не верно. Введено: " + check + "\n";
                fileJson.setFillingErrorList(s);
            }
        }
        return check;
    }

    public String scan_5() {
        System.out.print("4. Введите пол животного, формат записи 'М' или 'Ж' -> ");
        String check = stringScanner.nextLine();
        if (!(check.matches("[МЖ]") | check.matches("[мж]"))) {
            String s = "- Пол животного задан не верно, формат записи 'М' или 'Ж'. Введено: " + check + "\n";
            fileJson.setFillingErrorList(s);
        }
        return check;
    }

    public String scan_6() {
        System.out.print("5. Введите день рождение животного, формат записи год-месяц-день: " +
                "\n\tгод от 1999 до 2024, например (1999-12-01) -> ");
        String check = stringScanner.nextLine();
        if (!checkScan_6(check)) {
            String s = "- День рождение животного задан не верно, формат записи год-месяц-день (1999-12-01). Введено: " + check + "\n";
            fileJson.setFillingErrorList(s);
        }
        return check;
    }

    public String scan_7() {
        System.out.print("5. Введите прочию информацио о животном -> ");
        return stringScanner.nextLine();
    }

    public String scan_8() {
        System.out.println("Для продолжения выберите действия:");
        System.out.println("\tРедактировать карточку  - - - - - нажмите '1'");
        System.out.println("\tВыход в главное меню  - - - - - - нажмите '2'");
        System.out.print("Введите число -> ");
        return stringScanner.nextLine();
    }

    public String scan_9() {
        System.out.print("6. Введите команды через 'пробел', которая знает животное. -> ");
        return stringScanner.nextLine();
    }


    public String scan_10(@NotNull Integer num) {
        boolean fl = true;
        String n;
        String str = "Для удалении записи, "
                + "\nвведите порядковый номер записи из списка реестра от 1 до "
                + num
                + "\nили введите '0' для выхода в главное меню" + " -> ";
        do {
            System.out.print(str);
            n = stringScanner.nextLine();
            try {
                Integer.valueOf(n);
                int t = Integer.parseInt(n);
                if (t >= 0 & t <= num) {
                    fl = false;
                } else {
                    System.out.print("Формат ввода неверный!\n" + str + "\n");
                }
            } catch (NumberFormatException e) {
                System.out.print("Формат ввода неверный!\n" + str + "\n");
            }
        } while (fl);
        return n;
    }

    public String scan_11() {
        System.out.println("\tВыберите из списка команду для обучения:");
        System.out.print("""
                \t1. Лежать\t2. Бежать\t3. Прыгать
                \t4. Стоять\t5. Бррр  \t6. Апорт
                \t7. Замереть\t8. Молчать\t9. Голос
                 - Какой командой необходимо обучить животное? -""");

        String check;
        boolean fl = true;
        do {
            System.out.print("\nВведите число -> ");
            check = stringScanner.nextLine();
            if (!check.matches("[123456789]")) {
                System.out.println("\tВведено неверное значение.");
            } else {

                fl = false;
            }
        } while (fl);
        return check;
    }

    public String scan_12(@NotNull Integer num) {
        boolean fl = true;
        String n;
        System.out.println("\t - - Второй этап. - - ");
        System.out.println("\tВыберите животное для обучения:");
        String str = "Для обучения командам, " + "\nвведите порядковый номер записи из списка реестра от 1 до " + num + "\nили введите '0' для выхода в главное меню" + " -> ";
        do {
            System.out.print(str);
            n = stringScanner.nextLine();
            try {
                Integer.valueOf(n);
                int t = Integer.parseInt(n);
                if (t >= 0 & t <= num) {
                    fl = false;
                } else {
                    System.out.print("Формат ввода неверный!\n" + str + "\n");
                }
            } catch (NumberFormatException e) {
                System.out.print("Формат ввода неверный!\n" + str + "\n");
            }
        } while (fl);
        return n;
    }

    boolean checkScan_6(@NotNull String s) {
        boolean fl;
        int[] ind = new int[3];
        String[] ss = s.split("-");
        if (ss.length == 3) {
            fl = ss[0].matches("[0-9]+") & ss[1].matches("[0-9]+") & ss[2].matches("[0-9]+");
        } else fl = false;

        if (fl) {
            for (int i = 0; i < ss.length; i++) ind[i] = Integer.parseInt(ss[i]);
            fl = (ind[0] > 1998 & ind[0] <= 2024) & (ind[1] >= 1 & ind[1] <= 12) & (ind[2] >= 1 & ind[2] <= 31);
        }
        return fl;
    }

    public void scan_empty() {
        System.out.print("Для продолжения нажмите 'ENTER' -> ");
        String n = stringScanner.nextLine();
    }

}
