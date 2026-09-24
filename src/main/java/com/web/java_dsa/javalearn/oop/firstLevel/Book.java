package com.web.java_dsa.javalearn.oop.firstLevel;

public class Book {
    private final String title;
    private final String author;
    private final String isbn;
    private final int pages;

    public Book(String title,String author,String isbn,int pages){
        this.title=title;
        this.author=author;
        this.isbn=isbn;
        this.pages=pages;
    }

    public String about(){
        return "Title: " + title + ", Author: " + author + ", ISBN: " + isbn + ", Pages: " + pages;
    }

    public static void main(String[] args) {
        // 9. Book
        //
        //Book klassini yarating.
        //
        //title
        //author
        //isbn
        //pages
        //
        //Kitob haqida ma'lumot chiqaruvchi metod yarating.
    }
}
