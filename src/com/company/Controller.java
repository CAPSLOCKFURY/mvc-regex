package com.company;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Controller {

    private final static Pattern namePattern = Pattern.compile("[a-zA-Zа-яА-Я]+$");
    private final static Pattern emailPattern = Pattern.compile("[a-z0-9.]+@[a-z]+(.com|.net|.ukr|.ru|.ua)$");
    private final static Pattern phonePattern = Pattern.compile("380([0-9]{9})");
    private final static Pattern nickNamePattern = Pattern.compile("[a-zA-Z_0-9-]+$");

    private Person model;
    private View view;

    public Controller(Person model, View view) {
        this.model = model;
        this.view = view;
    }

    /**
     * Processes user input and saves it into {@link #model}
     */
    public void processUser(){
        Scanner sc = new Scanner(System.in);
        String firstName = inputField(sc, namePattern, View.FIELD_FIRST_NAME, View.ENTER_FIRST_NAME);
        String lastName = inputField(sc, namePattern, View.FIELD_LAST_NAME, View.ENTER_LAST_NAME);
        String nickName = inputField(sc, nickNamePattern, View.FIELD_NICK_NAME, View.ENTER_NICK_NAME);
        String phoneNumber = inputField(sc, phonePattern, View.FIELD_PHONE_NUMBER, View.ENTER_PHONE);
        String email = inputField(sc, emailPattern, View.FIELD_EMAIL, View.ENTER_EMAIL);
        Person person = new Person(firstName, lastName, nickName, phoneNumber, email);
        view.printMessage(View.SUCCESS_DATA_SAVED);
    }

    /**
     * @param sc Scanner for data input
     * @param fieldPattern Scanner will match input validating with this regex pattern
     * @param fieldName Needed for displaying error with field name in view
     * @param helpText Needed for displaying help text with input information for user
     * @return returns String that had been validated by {@code fieldPattern}
     */
    private String inputField(Scanner sc, Pattern fieldPattern, String fieldName, String helpText){
        view.printMessage(helpText);
        while (!sc.hasNext(fieldPattern)){
            view.printIncorrectInput(fieldName);
            sc.nextLine();
        }
        return sc.nextLine();
    }

}
