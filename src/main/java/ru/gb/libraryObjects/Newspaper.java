package ru.gb.libraryObjects;

import ru.gb.Author;
import ru.gb.AbstractObjectInLibrary;

public class Newspaper extends AbstractObjectInLibrary {
    private int month;
    private int year;

    public Newspaper(int id, String name, Author author, int month, int year) {
        super(id, name, author);
        this.month = month;
        this.year = year;
    }
}
