package StreamAndLambda;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book("Little Prince", 96, "Antoine de Saint-Exupéry", 1943));
        books.add(new Book("The Alchemist", 163, "Paulo Coelho", 1988));
        books.add(new Book("Of Mice And Men", 107, "John Steinbeck", 1937));
        books.add(new Book("Chess", 104, "Stefan Zweig", 1943));
        books.add(new Book("Thomas More", 96, "Thomas More", 1516));
        books.add(new Book("İmparatorluğun En Uzun Yüzyılı", 335, "İlber Ortaylı", 1983));
        books.add(new Book("King Lear", 146, "William Shakespeare", 1606));
        books.add(new Book("The Catcher in the Rye", 234, "J. D. Salinger", 1951));
        books.add(new Book("Improbable", 464, "Adam Fawer", 2006));
        books.add(new Book("Atomic Habits", 306, "James Clear", 2018));

        System.out.println("*** Map ***");
        books.stream().map(str -> str.getBookName() + " - " + str.getAuthor()).forEach(System.out::println);
        System.out.println("*** Filter ***");
        books.stream().filter(num -> num.getPageNumber() > 100).forEach((str -> System.out.println(str.getBookName() + " - " + str.getPageNumber())));
    }
}
