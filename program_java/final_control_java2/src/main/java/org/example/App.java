package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class App implements ViewInterface {
    private Boolean flag;
    private Boolean fl1 = true;
    public static void Start() {
        fileJson.fileDataJson();
        log.log();
        log.setLogger("Запуск программы 'Реестр питомника. Домашние и вьючные животные.'");
        view.interface_0();
        do {
            System.out.println("\t\tКоличество животных в питомнике: " + fileJson.getAnimalCount());
            if (fileJson.getAnimalCount() > 1) {
                choice.choice_0(view.interface_main());
            }
            else {
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
