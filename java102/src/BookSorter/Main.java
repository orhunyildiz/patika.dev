package BookSorter;

import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Improbable", 447, "Adam Fawer", 2006);
        Book book2 = new Book("1984", 328, "George Orwell", 1949);
        Book book3 = new Book("Utopia", 96, "Thomas More", 1516);
        Book book4 = new Book("The Iliad", 560, "Homer", -762);
        Book book5 = new Book("Of Mice and Men", 107, "John Steinbeck", 1937);

        HashSet<Book> hashBook = new HashSet<>();
        hashBook.add(book1);
        hashBook.add(book2);
        hashBook.add(book3);
        hashBook.add(book4);
        hashBook.add(book5);

        System.out.println("*** HashSet ***");
        for (Book book : hashBook) {
            System.out.println("Name: " + book.getName() +
                    " - Author: " + book.getAuthor() +
                    " - Pages: " + book.getPageNumber() +
                    " - Release Date: " + book.getReleaseDate());
        }

        TreeSet<Book> bookTreeSet = new TreeSet<>();
        bookTreeSet.add(book1);
        bookTreeSet.add(book2);
        bookTreeSet.add(book3);
        bookTreeSet.add(book4);
        bookTreeSet.add(book5);

        System.out.println("*** TreeSet ***");
        for (Book book : bookTreeSet) {
            System.out.println("Name: " + book.getName() +
                    " - Author: " + book.getAuthor() +
                    " - Pages: " + book.getPageNumber() +
                    " - Release Date: " + book.getReleaseDate());
        }

    }
}
