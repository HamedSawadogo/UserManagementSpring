package com.example.javatestdto.service;

import com.example.javatestdto.model.Book;
import com.example.javatestdto.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements  BookService{

    @Autowired
    private BookRepository bookRepository;

    @Override
    public Book addBook(Book book) {
        return this.bookRepository.save(book);
    }

    @Override
    public void deleteBook(int bookid) {
        this.bookRepository.deleteById(bookid);
    }

    @Override
    public Optional<Book> findBookByid(int id) {
        return this.bookRepository.findById(id);
    }

    @Override
    public List<Book> getBooks() {
        return this.bookRepository.findAll();
    }
}
