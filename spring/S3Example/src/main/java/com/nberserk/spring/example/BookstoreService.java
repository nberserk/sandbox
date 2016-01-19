package com.nberserk.spring.example;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by darren on 2016. 1. 19..
 */
public class BookstoreService {
    HashSet<Book> books = new HashSet<Book>();

    public BookstoreService(){
        books.add( new Book("Zeppelin", "darren"));
        books.add( new Book("Goosebumps", "andrew"));
    }

    public void addBook(Book book){
        books.add(book);
    }


    public Set<Book> getBooks(){
        return books;
    }

    public Book getBook(String title) {
        for (Book b: books){
            if(title.equals(b.getTitle()))
                return b;
        }
        return null;
    }
}
