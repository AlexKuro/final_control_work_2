package org.example;

public class Scans implements ViewInterface {

    public Integer scan_1() {
        System.out.print("\nВведите число -> ");
        return intScanner.nextInt();
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
                 \tукажите 'беспородная', при смешанной породе укажите 'метис'.
                """);
        System.out.print("Введите породу животного -> ");
        String check = stringScanner.nextLine();
        if (check.length() < 3) {
            String s = "- Порода животного задана не верно. Введено: " + check + "\n";
            fileJson.setFillingErrorList(s);
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
        System.out.print("5. Введите день рождение животного, формат записи год-месяц-день (1999-12-01) -> ");
        return stringScanner.nextLine();
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

    public String scan_10(Integer num) {
        boolean fl = true;
        String n;
        String str = "Для удалении записи, " +
                "\nвведите порядковый номер записи из списка реестра от 1 до "
                + num.toString() + "\nили введите '0' для выхода в главное меню" + " -> ";
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

}
