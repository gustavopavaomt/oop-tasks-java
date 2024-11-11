import domain.Book;
import repository.BookList;
import service.ILibBooks;

public class Main{

    public static void main(String[] args) {

        Book livro1 = new Book("TItulo1","Author1","teste");
        Book livro2 = new Book("Titulo2","author2","teste2");
        ILibBooks lista = new BookList();
        //test
        lista.addBook(livro1);
        lista.addBook(livro2);
        lista.removeBook(livro2);
        lista.printBooks();
    }
}