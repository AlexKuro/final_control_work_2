package org.example;

import java.util.Scanner;

public interface ViewInterface {
    App app = new App();
    Scanner intScanner = new Scanner(System.in);
    Scanner stringScanner = new Scanner(System.in);
    Scans scans = new Scans();
    Log log = new Log();
    View view = new View();
    Choice choice = new Choice();
    IdUnix idUnix = new IdUnix();
    FileJson fileJson = new FileJson();
    ViewSign viewSign = new ViewSign();
    Animal animal = new Animal();
    PrintData printData = new PrintData();
    Command command = new Command();
    PackAnimals packAnimals = new PackAnimals();
    Pets pets = new Pets();
}
