package org.example;

/**
 * Класс реализует:
 * Запуск консольной программы.
 * Выход из программы.
 */
public class App implements ViewInterface {

    private Boolean flagMain;
    private Boolean flagChoiceMenu = true;

    public Boolean getFlagChoiceMenu() {
        return flagChoiceMenu;
    }

    public void setFlagChoiceMenu(Boolean flagChoiceMenu) {
        this.flagChoiceMenu = flagChoiceMenu;
    }

    public Boolean getFlagMain() {
        return flagMain;
    }

    public void setFlagMain(Boolean flagMain) {
        this.flagMain = flagMain;
    }

    public static void Start() {
        fileJson.fileDataJson();
        log.log();
        log.setLogger("Запуск программы 'Реестр питомника. Домашние и вьючные животные.'");
        view.interface_0();
        do {
            System.out.println("\t\tКоличество животных в питомнике: " + fileJson.getAnimalCount());
            pets.copyData();
            packAnimals.copyData();

            Integer a = petsCount.countPetsShow();
            Integer b = packAnimalsCount.countPackAnimalsShow();

            if (a > 0) System.out.println("\t\t\tДомашние животные: " + a);
            if (b > 0) System.out.println("\t\t\tВьючные  животные: " + b);

            if (fileJson.getAnimalCount() > 1) choice.choice_0(view.interface_main());
            else choice.choice_0_1(view.interface_main_1());

        } while (app.end());
    }

    Boolean end() {
        return getFlagMain();
    }

    public void endProgram() {
        System.out.print("Завершение программы 'Реестр питомника. Домашние и вьючные животные.'.\n\n");
        log.setLogger("Завершение программы 'Реестр питомника. Домашние и вьючные животные.'.");
        intScanner.close();
        stringScanner.close();
    }
}
