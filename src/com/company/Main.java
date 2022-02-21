package com.company;

public class Main {

    public static void main(String[] args) {
        Person model = new Person();
        View view = new View();
        Controller controller = new Controller(model, view);
        controller.processUser();
    }
}
