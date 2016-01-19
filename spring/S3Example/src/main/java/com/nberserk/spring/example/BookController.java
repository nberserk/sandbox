package com.nberserk.spring.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

/**
 * Created by darren on 2016. 1. 13..
 */
@Controller
public class BookController {

    @Autowired
    private BookstoreService bookService;

    @RequestMapping(value="/books", method= RequestMethod.GET)//,            produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Set<Book> getBooks( @RequestHeader(required = false) String accept){
        System.out.println("headers:" + accept);
        //model.addAttribute("movie", name);
        return bookService.getBooks();
    }

    @RequestMapping(value="/book/{title}", method = RequestMethod.GET)
    @ResponseBody
    public Book getBook(@PathVariable String title){
        return bookService.getBook(title);
    }
}
