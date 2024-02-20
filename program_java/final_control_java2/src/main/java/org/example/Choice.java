package org.example;

import org.jetbrains.annotations.NotNull;

public class Choice implements ViewInterface {

    public void choice_0(@NotNull Integer n) {
        switch (n) {
            case 1 -> {
                do {
                    view.setFieldNum(1);
                    view.interface_1();
                    animal.addAnimal();
                    app.setFl1(false);
                    view.setFieldNum(0);
                } while (app.getFl1());
            }
            case 2 -> {
                view.setFieldNum(2);
                view.interface_2();
                printData.printJson();
                view.setFieldNum(0);
            }

            case 3 -> {
                view.setFieldNum(4);
                view.interface_2();
                view.setFieldNum(2);
                view.interface_4();
                printData.printJson();
                animal.delAnimal();
                view.setFieldNum(0);
            }
            case 4 -> {
                view.setFieldNum(5);
                view.interface_2();
                command.addCommand();

                view.setFieldNum(0);
            }
            case 9 -> app.endProgram();
            default -> System.out.print("Формат ввода неверный!\n");
        }
    }


    public void choice_0_1(@NotNull Integer n) {
        switch (n) {
            case 1 -> {
                do {
                    view.setFieldNum(1);
                    view.interface_1();
                    animal.addAnimal();
                    app.setFl1(false);
                    view.setFieldNum(0);
                } while (app.getFl1());
            }
            case 9 -> app.endProgram();
            default -> System.out.print("Формат ввода неверный!\n");
        }
    }
}
