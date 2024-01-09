package ru.gb;

import java.util.List;
import java.util.stream.Collectors;

public class SearchEngineService {
    private List<AbstractObjectInLibrary> libraryList;

    public SearchEngineService(List<AbstractObjectInLibrary> libraryList) {
        this.libraryList = libraryList;
    }

    public List<AbstractObjectInLibrary> scan(int id){
        return libraryList
                .stream()
                .filter(e -> e.getId() == id)
                .collect(Collectors.toList());
    }

    public List<AbstractObjectInLibrary> scan(String author){
        return libraryList
                .stream()
                .filter(e -> e.getAuthor().getFullName().equals(author))
                .collect(Collectors.toList());
    }

    public List<AbstractObjectInLibrary> scan(int id, String author){
        return libraryList
                .stream()
                .filter(e -> e.getId() == id)
                .filter(e -> e.getAuthor().getFullName().equals(author))
                .collect(Collectors.toList());
    }
}
