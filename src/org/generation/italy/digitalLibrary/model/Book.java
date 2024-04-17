package org.generation.italy.digitalLibrary.model;

//titolo, autore, genere, anno di pubblicazione e numero di pagine e id. 
public class Book {

    private String name;
    private String authorFullName;
    private String genre;
    private int year;
    private int totalPages;
    private int id;

    public Book(String name, String authorFullName, String genre, int year, int totalPages, int id) {
        this.name = name;
        this.authorFullName = authorFullName;
        this.genre = genre;
        this.year = year;
        this.totalPages = totalPages;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Integer getPages() {
        return totalPages;
    }

    public Integer getYear() {
        return year;
    }

    public String getAuthor() {
        return authorFullName;
    }

}
