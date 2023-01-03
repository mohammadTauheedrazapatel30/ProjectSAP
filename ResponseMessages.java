/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sap.projectsap.model.enums;

/**
 *
 * @author Mohammad Tauheed
 */
public enum ResponseMessages {
    
    NAME_CANT_EMPTY("Student Name cannot be empty!"),
    EMAIL_CANT_EMPTY("Student Email cannot be empty"),
    DATA_ADDED("Data Added Successfully"),
    UNABLE_TO_ADD("Unable to add the particular data"),
    DATA_DELETED("Data Deleted Successfully"),
    UNABLE_TO_DELETE("Unable to Delete"),
    DATA_UPDATED("Data Updated Successfully"),
    UNABLE_TO_UPDATE("Unable to Update"),
    ALREADY_REGISTERED("You Are Already Registered, Please login to proceed"),
    USER_NOT_FOUND_WITH_ID("No User found with this id"),
    UNABLE_TO_FIND_ID("Unable to find the Id"),
    ENTER_YOUR_NAME("Please enter your Name"),
    ENTER_YOUR_EMAIL("Please enter your email Id"),
    ENTER_YOUR_CONTEXT("Enter some context"),
    ID_CAN_BE_EMPTY("iD CANNOT BE EMPTY");
    
    private String message;

    private ResponseMessages() {
    }
    

    private ResponseMessages(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
}
