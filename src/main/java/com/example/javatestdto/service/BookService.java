package com.example.javatestdto.service;

import com.example.javatestdto.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface BookService {
    public Book addBook(Book book);
    public void deleteBook(int bookid);
    public Optional<Book>findBookByid(int id);
    public List<Book>getBooks();
}
