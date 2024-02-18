package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Command implements ViewInterface {
    private ArrayList<String> command = new ArrayList<>();

    public void addCommand() {
        view.setFieldNum(5);
        view.interface_2();
        String[] s = printData.arrayKey().clone();
        view.setFieldNum(6);
        view.interface_4();
        String command = SCANS.scan_11();
        view.setFieldNum(7);
        view.interface_4();
        view.setFieldNum(2);
        view.interface_4();
        printData.printJson();
        int animalCommand = Integer.parseInt(SCANS.scan_12(s.length)) - 1;

        if (animalCommand > 0) {
            System.out.println("\t---------------------------------------------");
            System.out.println("\tОбучение выполнено успешно! \n" +
                    "\tКоманда '" + printCommand(command) + "' выполняется успешно!.");
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