package ru.gb;

import ru.gb.libraryObjects.Book;
import ru.gb.libraryObjects.Magazine;
import ru.gb.libraryObjects.Microfilm;
import ru.gb.libraryObjects.Newspaper;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<AbstractObjectInLibrary> library = new ArrayList<>();
        library.add(new Book(12345, "Чужак", new Author("Макс", "Фрай"), "фэнтези",2023));
        library.add(new Book(14567, "Волонтеры вечности", new Author("Макс", "Фрай"), "фэнтези",2022));
        library.add(new Book(24589, "Моя семья и другие звери", new Author("Джеральд", "Даррелл"), "повесть",1981));
        library.add(new Magazine(34521, "Мурзилка", new Author("автор", "неизвестен"), 05, 1996));
        library.add(new Microfilm(65777, "Документы", new Author("Иван", "Иванов"), 1998));
        library.add(new Magazine(43765, "Мурзилка", new Author("автор", "неизвестен1"), 11, 1999));
        library.add(new Newspaper(67854, "Известия", new Author("автор", "неизвестен2"),10, 1992));
        library.add(new Newspaper(98543, "Известия", new Author("автор", "неизвестен3"), 07, 1993));

        SearchEngineService searchEngineService = new SearchEngineService(library);

        System.out.println(searchEngineService.scan(65777));
        System.out.println(searchEngineService.scan(34521));
        System.out.println(searchEngineService.scan(24589,"Джеральд" + "Даррелл"));
        System.out.println(searchEngineService.scan("Макс" + "Фрай"));
    }
}