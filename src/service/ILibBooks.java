package service;


import domain.Book;

public interface ILibBooks {

    void addBook(Book book);

    void removeBook(Book book);

    void printBooks();
}
