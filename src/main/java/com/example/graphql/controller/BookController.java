package com.example.graphql.controller;

import com.example.graphql.graphentities.BookInput;
import com.example.graphql.model.Book;
import com.example.graphql.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookServiceImpl bookService;

    //create
    //@PostMapping    // JSON object will be serialized into Book object.
    @MutationMapping("createBook")
    public Book create(@Argument BookInput book){
        Book bookToSave = new Book();
        bookToSave.setTitle(book.getTitle());
        bookToSave.setDesc(book.getDesc());
        bookToSave.setAuthor(book.getAuthor());
        bookToSave.setPrice(book.getPrice());
        return bookService.createBook(bookToSave);
    }

    //all
    //@GetMapping
    @QueryMapping("allBooks")
    public List<Book> getAllBooks(){
        return this.bookService.getAllBooks();
    }

    //single
    //@GetMapping("/{bookId}")
    @QueryMapping("getABook")
    public Book getBookById(@Argument Long bookId){
        return this.bookService.getBook(bookId);
    }
}

