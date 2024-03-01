package org.example;

import java.util.Scanner;

public interface ViewInterface {

    App app = new App();
    Log log = new Log();
    Pets pets = new Pets();
    View view = new View();
    Scans scans = new Scans();
    Animal animal = new Animal();
    Choice choice = new Choice();
    IdUnix idUnix = new IdUnix();
    Command command = new Command();

    FileJson fileJson = new FileJson();
    ViewSign viewSign = new ViewSign();
    PetsCount petsCount = new PetsCount();
    PrintData printData = new PrintData();
    PackAnimals packAnimals = new PackAnimals();
    Scanner intScanner = new Scanner(System.in);
    Scanner stringScanner = new Scanner(System.in);
    PackAnimalsCount packAnimalsCount = new PackAnimalsCount();
}
