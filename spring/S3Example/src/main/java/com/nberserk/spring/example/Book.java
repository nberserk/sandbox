package com.nberserk.spring.example;

/**
 * Created by darren on 2016. 1. 19..
 */
public class Book {
    private String author;
    private String title;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
