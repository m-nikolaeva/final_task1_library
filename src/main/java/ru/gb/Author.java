package ru.gb;

public class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName(){
        return firstName + "" + lastName;
    }

    @Override
    public String toString() {
        return "автор: " +
                firstName + " " + lastName;
    }
}
