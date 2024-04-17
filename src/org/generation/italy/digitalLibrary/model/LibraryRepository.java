package org.generation.italy.digitalLibrary.model;

import java.util.HashMap;
import java.util.Map;

public class LibraryRepository {
    private static Map<Integer, Book> libraryRepo = new HashMap<>(); 

    static {
        Book book1 = new Book("Il signore degli anelli", "Tolkien, J.R.R.", "Fantasy", 1954, 800, 1);
        Book book2 = new Book("1984", "Orwell, George", "Distopia", 1949, 328, 2);
        Book book3 = new Book("Orgoglio e pregiudizio", "Austin, Jane", "Romance", 1813, 279, 3);
        Book book4 = new Book("Il trono di spade", "Martin, George R.R.", "Fantasy", 1996, 694, 4);
        Book book5 = new Book("La ragazza del treno", "Hawkins, Paula", "Thriller", 2015, 336, 5);
    
        libraryRepo.put(book1.getId(), book1);
        libraryRepo.put(2, book2);
        libraryRepo.put(3, book3);
        libraryRepo.put(4, book4);
        libraryRepo.put(5, book5);
    }
}
