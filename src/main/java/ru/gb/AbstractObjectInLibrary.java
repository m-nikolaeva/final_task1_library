package ru.gb;

public abstract class AbstractObjectInLibrary {
    private int id;
    private String name;
    private Author author;

    public AbstractObjectInLibrary(int number, String name, Author author) {
        this.id = number;
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Результаты поиска: " +
                "рег.номер: " + id +
                ", название: '" + name + '\'' +
                ", " + author;
    }

    public int getId() {
        return id;
    }

    public Author getAuthor() {
        return author;
    }
}
