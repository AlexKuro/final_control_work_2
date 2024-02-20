package org.example;


import lombok.Getter;

@Getter
public class View implements ViewInterface {

    private Integer fieldNum = 0;

    public void setFieldNum(Integer fieldNum) {
        this.fieldNum = fieldNum;
    }

    public void interface_0() {
        System.out.print("\033[H\033[2J"); // очистка консоли
        System.out.println("\n -- Реестр питомника. Домашние и вьючные животные. --");
    }

    public Integer interface_main() {
        app.setFlag(true);
        System.out.println(viewSign.SignField(getFieldNum()));
        System.out.println("\tДобавление животного  - - - - - - нажмите '1'");
        System.out.println("\tСписок животных - - - - - - - - - нажмите '2'");
        System.out.println("\tУдаление записи - - - - - - - - - нажмите '3'");
        System.out.println("\tОбучение командам - - - - - - - - нажмите '4'");
        System.out.println("\tВыход из программы  - - - - - - - нажмите '9'");
        return scans.scan_1();
    }

    public Integer interface_main_1() {
        app.setFlag(true);
        System.out.println(viewSign.SignField(getFieldNum()));
        System.out.println("\tДобавление животного  - - - - - - нажмите '1'");
        System.out.println("\tВыход из программы  - - - - - - - нажмите '9'");
        return scans.scan_0();
    }

    public void interface_1() {
        app.setFlag(true);
        System.out.println(viewSign.SignField(getFieldNum()));
    }

    public void interface_2() {
        app.setFlag(true);
        System.out.println(viewSign.SignField(getFieldNum()));
    }

    public void interface_4() {
        System.out.println(viewSign.SignField(getFieldNum()));
    }

}
