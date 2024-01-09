package ru.gb.libraryObjects;

import ru.gb.Author;
import ru.gb.AbstractObjectInLibrary;

public class Magazine extends AbstractObjectInLibrary {
    private int month;
    private int year;

    public Magazine(int id, String name, Author author, int month, int year) {
        super(id, name, author);
        this.month = month;
        this.year = year;
    }
}
