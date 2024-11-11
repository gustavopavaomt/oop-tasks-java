package repository;

import domain.Book;
import service.ILibBooks;


import java.util.ArrayList;

public class BookList implements ILibBooks {

    private ArrayList<Book> books = new ArrayList<>();
    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public void removeBook(Book book) {
        books.remove(book);
    }

    @Override
    public void printBooks() {
        for(Book book : books) {
            System.out.println(book);
        }
    }
}
