package org.example;

import org.jetbrains.annotations.NotNull;

public class Command implements ViewInterface {
    public void addCommand() {
        String[] str = printData.arrayKey().clone();
        view.setFieldNum(6);
        view.interface_4();
        String commandNum = scans.scan_11();
        view.setFieldNum(7);
        view.interface_4();
        view.setFieldNum(2);
        view.interface_4();
        printData.printJson();
        int animalCommand = Integer.parseInt(scans.scan_12(str.length)) - 1;
        String s = fileJson.setCommand(str[animalCommand]) + " " + printCommand(commandNum);
        fileJson.addCommand(str[animalCommand], s);
        fileJson.writeFile();
        scans.scan_empty();

        if (animalCommand > 0) {
            System.out.println("\t---------------------------------------------");
            System.out.println("\tОбучение выполнено успешно! \n" +
                    "\tКоманда '" + printCommand(commandNum) + "' выполняется успешно!.");
            System.out.println("\t---------------------------------------------");
        }
    }

    public String printCommand(@NotNull String command) {
        return switch (command) {
            case "1" -> "Лежать";
            case "2" -> "Бежать";
            case "3" -> "Прыгать";
            case "4" -> "Стоять";
            case "5" -> "Бррр";
            case "6" -> "Апорт";
            case "7" -> "Замереть";
            case "8" -> "Молчать";
            case "9" -> "Голос";
            default -> "-";
        };
    }

}
