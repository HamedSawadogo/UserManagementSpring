package com.example.javatestdto.controller;

import com.example.javatestdto.model.Book;
import com.example.javatestdto.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookServiceImpl bookService;

    @GetMapping("/api/books")
    public List<Book>getBooks(){
        return this.bookService.getBooks();
    }

    @PostMapping("/api/book/add")
    public Book addBook(@RequestBody Book book){
        return this.bookService.addBook(book);
    }
}
