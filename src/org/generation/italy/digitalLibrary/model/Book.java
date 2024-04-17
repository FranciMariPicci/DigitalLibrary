package org.generation.italy.digitalLibrary.model;

//titolo, autore, genere, anno di pubblicazione e numero di pagine. 
public class Book {

    private String name;
    private String fullName;
    private String genre;
    private int year;
    private int totalPages;
    private int id;

    public Book(String name, String fullName, String genre, int year, int totalPages, int id) {
        this.name = name;
        this.fullName = fullName;
        this.genre = genre;
        this.year = year;
        this.totalPages = totalPages;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }



    
}
