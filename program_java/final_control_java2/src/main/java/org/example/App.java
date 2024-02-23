package org.example;


public class App implements ViewInterface {

    private Boolean flag;
    private Boolean fl1 = true;

    public Boolean getFl1() {
        return fl1;
    }

    public void setFl1(Boolean fl1) {
        this.fl1 = fl1;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public static void Start() {
        fileJson.fileDataJson();
        log.log();
        log.setLogger("Запуск программы 'Реестр питомника. Домашние и вьючные животные.'");
        view.interface_0();
        do {
            System.out.println("\t\tКоличество животных в питомнике: " + fileJson.getAnimalCount());
            System.out.println("\t\t\tДомашние животные: " + petsCount.countPetsShow());
            System.out.println("\t\t\tВьючные  животные: " + packAnimalsCount.countPackAnimalsShow());

            if (fileJson.getAnimalCount() > 1) {
                choice.choice_0(view.interface_main());
            } else {
                choice.choice_0_1(view.interface_main_1());
            }
        } while (app.end());
    }

    Boolean end() {
        return getFlag();
    }

    public void endProgram() {
        System.out.print("Завершение программы 'Реестр питомника. Домашние и вьючные животные.'.\n\n");
        log.setLogger("Завершение программы 'Реестр питомника. Домашние и вьючные животные.'.");
        intScanner.close();
        stringScanner.close();
        setFlag(false);
        setFl1(false);
    }
}
