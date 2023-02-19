package org.example.SerializationProject.model;

public class ChildNotFoundException extends Exception {
    @Override
    public String getMessage() {
        return "Child not found";
    }
}
