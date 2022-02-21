package com.company;

/**
 * Fields starting with ENTER_ is for help text
 * Fields starting with FIELD_ is field names of model
 * Fields starting with SUCCESS_ is for success messages
 */
public class View {

    public final static String ENTER_FIRST_NAME = "Enter first name: ";
    public final static String ENTER_LAST_NAME = "Enter last name: ";
    public final static String ENTER_EMAIL = "Enter email: ";
    public final static String ENTER_PHONE = "Enter ukrainian phone number starting with 380: ";
    public final static String ENTER_NICK_NAME = "Enter nick name" +
            "(allowed upper and lowercase english characters, numbers, hyphens, underscores): ";


    public final static String SUCCESS_DATA_SAVED = "Success, your data has been saved";

    private final static String INCORRECT_FIELD = "Incorrect input at field: ";

    public final static String FIELD_FIRST_NAME = "First Name";
    public final static String FIELD_LAST_NAME = "Last Name";
    public final static String FIELD_EMAIL = "Email";
    public final static String FIELD_PHONE_NUMBER = "Phone Number";
    public final static String FIELD_NICK_NAME = "Nickname";

    /**
     * @param message String to print
     */
    public void printMessage(String message){
        System.out.println(message);
    }

    /**
     * Prints that input is incorrect at field {@code fieldName}
     * @param fieldName field name to print error about
     */
    public void printIncorrectInput(String fieldName){
        System.out.println(INCORRECT_FIELD + fieldName);
    }

}
