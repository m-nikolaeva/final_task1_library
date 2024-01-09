package ru.gb.libraryObjects;

import ru.gb.Author;
import ru.gb.AbstractObjectInLibrary;

public class Book extends AbstractObjectInLibrary {
    private String genre;
    private int year;


    public Book (int id, String name, Author author, String genre, int year) {
        super(id, name, author);
        this.genre = genre;
        this.year = year;
    }
}
