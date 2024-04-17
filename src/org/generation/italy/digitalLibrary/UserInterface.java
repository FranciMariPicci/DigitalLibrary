package org.generation.italy.digitalLibrary;

import java.util.Map;
import java.util.Scanner;

import org.generation.italy.digitalLibrary.model.Book;
import org.generation.italy.digitalLibrary.model.BookRepository;

public class UserInterface {

    // Trovare il numero di libri pubblicati in un anno specifico.
    // Trovare tutti i libri di un autore specifico e ordinarli per anno di pubblicazione.

    private Scanner console = new Scanner(System.in);
    private BookRepository libraryRepo = new BookRepository();

    public void getBooksCountInYear(){
        System.out.println("Inserire l'anno di pubblicazione:");
        int publicationYear = console.nextInt();
        console.nextLine();
        if(libraryRepo.getBooksCountInYear(publicationYear)==0){
            System.out.printf("Non ci sono libri dell'anno %d nella libreria.", publicationYear);
        } else {
            System.out.printf("Il totale dei libri presenti nella libreria pubblicati nell'anno %d sono %d", publicationYear, libraryRepo.getBooksCountInYear(publicationYear));
        }
    }
}
