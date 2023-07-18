package com.example.graphql.service;

import com.example.graphql.model.Book;

import java.util.List;

public interface IBookService {
    Book createBook(Book book);

    //list books
    List<Book> getAllBooks();

    //show Book
    Book getBook(Long id);
}
