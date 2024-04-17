package org.generation.italy.digitalLibrary.model;

// Trovare il numero totale di libri nella libreria.
// Trovare il numero totale di pagine in tutta la libreria.

// Trovare tutti gli autori distinti nella libreria.
// Trovare il genere con il maggior numero di libri.
// Trovare il libro più lungo (basato sul numero di pagine).

// Trovare i primi 5 libri pubblicati più recentemente.

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookRepository {
    private static Map<Integer, Book> libraryRepo = new HashMap<>(); 

    static {
        Book book1 = new Book("Il signore degli anelli", "Tolkien, J.R.R.", "Fantasy", 1954, 800, 1);
        Book book2 = new Book("1984", "Orwell, George", "Distopia", 1949, 328, 2);
        Book book3 = new Book("Orgoglio e pregiudizio", "Austin, Jane", "Romance", 1813, 279, 3);
        Book book4 = new Book("Il trono di spade", "Martin, George R.R.", "Fantasy", 1996, 694, 4);
        Book book5 = new Book("La ragazza del treno", "Hawkins, Paula", "Thriller", 2015, 336, 5);
        Book book6 = new Book("ILe due torri", "Tolkien, J.R.R.", "Fantasy", 1956, 945, 6);

        libraryRepo.put(book1.getId(), book1);
        libraryRepo.put(book2.getId(), book2);
        libraryRepo.put(book3.getId(), book3);
        libraryRepo.put(book4.getId(), book4);
        libraryRepo.put(book5.getId(), book5);
        libraryRepo.put(book6.getId(), book6);
    }

    public int countAllBooks() {
        return libraryRepo.size();
    }

    public int countAllPages() {
        return libraryRepo.values().stream().mapToInt(Book :: getPages).sum();                       
        //return libraryRepo.values().stream().mapToInt(book -> book.getPages()).sum();
    }

    public int getBooksCountInYear(Integer year){
        return (int)libraryRepo.values().stream().filter(book->book.getYear().equals(year)).count();
    }

    public List<String> getAllAuthors(){
        return libraryRepo.values().stream().map(Book::getAuthor).distinct().toList();
    }



}