package First_Homework;

import java.util.ArrayList;
import java.util.List;

public class Library_demo {

    public static void main(String... args){

        List<Book> books = new ArrayList<Book>();

        // coding now here :D
        Library library = new Library(
                "Library №151",
                "мкр. Северное Чертаново, д. 2, к. 207\n" +
                        "ул. Чертановская, д.27, к.2",
                "https://kulturauao.ru/biblio_151",
                books
        );

        books.add(new Book("Faust", "J.W.Goethe"));
        books.add(new Book("War and Peace", "L.N.Tolstoy"));
        books.add(new Book("Full collection of love poems", "A.S.Pushkin"));

        // me and my brothers :D

        Reader reader1 = new Reader("Fidel Altynbaev", 28);
        Reader reader2 = new Reader("Adel Altynbaev", 26);
        Reader reader3 = new Reader("Rafael Altynbaev", 25);

        library.addReader(reader1);
        library.addReader(reader2);
        library.addReader(reader3);



        // do it
        System.out.println("\n======\n");
        System.out.println(
                library.issueBook(0, reader1 ) + "\n"
        );
        System.out.println(
                library.issueBook(5, reader1 ) + "\n"
        );
        System.out.println(
                library.issueBook(2, reader3 ) + "\n"
        );
        System.out.println("\n======\n");






    }

}
