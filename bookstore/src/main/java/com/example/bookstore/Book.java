package com.example.bookstore;
public class Book {
    private Integer id;
    private String title;
    private String author;
    private String isbn;
    private Integer shelfNumber;
    public Book(Integer id, String title, String author, String isbn, Integer shelfNumber) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.shelfNumber = shelfNumber;
    }
    public Integer getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public String getIsbn(){
        return isbn;
    }
    public Integer getShelfNumber(){
        return shelfNumber;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public void setShelfNumber(Integer shelfNumber) {
        this.shelfNumber = shelfNumber;
    }
}
