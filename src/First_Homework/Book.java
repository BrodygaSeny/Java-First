package First_Homework;

public class Book {
    private String title;
    private String author;
    private boolean isRented = false;
    private int idBook;
    private static int incrementId = 0;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.idBook = incrementId++;
    }

    public String rent(Reader reader){
        if (this.isRented) {
            return "Book already rented!";
        } else {
            this.isRented = true;
            return "Book \"" + this.title + "\" has been issued " + reader.getName() +
                    ".\n Enjoy reading!";
        }
    }

    public int getIdBook() {
        return idBook;
    }

}
