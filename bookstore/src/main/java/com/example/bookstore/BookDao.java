package com.example.bookstore;
import java.util.List;
public interface BookDao {
    List<Book> getAllBooks();
    Book getBookById(Integer id);
    void saveBook(Book book);
    void deleteBook(Integer id);
}