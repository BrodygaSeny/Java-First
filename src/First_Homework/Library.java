package First_Homework;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private String name;
    private String address;
    private String site;

    private List<Reader> readers = new ArrayList<Reader>();
    private List<Book> books = new ArrayList<Book>();

    public Library(
            String name, String address, String site,
            List<Book> books
    ) {
        this.name = name;
        this.address = address;
        this.site = site;

        this.books = books;
    }


    public String issueBook(int idBook, Reader reader) {

        Book book = findBook(idBook);
        if (book == null) {
            return "Book not found";
        } else {
            return book.rent(reader);
        }

    }

    public void addReader(Reader reader){
        readers.add(reader);
    }



    private Book findBook(int idBook){
        for (Book book : books){
            if (idBook == book.getIdBook()){
                return book;
            }
        }
        return null;
    }






}
