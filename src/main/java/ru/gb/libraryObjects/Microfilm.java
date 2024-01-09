package ru.gb.libraryObjects;

import ru.gb.Author;
import ru.gb.AbstractObjectInLibrary;

public class Microfilm extends AbstractObjectInLibrary {
    private int year;

    public Microfilm(int id, String name, Author author, int year) {
        super(id, name, author);
        this.year = year;
    }
}
