package com.example.demo.service;

import com.example.demo.entity.Book;
import com.example.demo.repository.BookRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class BookService {

    @Value("${test.string}")
    private String testString;

    @Value("${test.integer}")
    private Integer testInteger;

    private final BookRepository bookRepository;

    public Book create(Book book) {
        return bookRepository.save(book);
    }

    public Optional<Book> getOne(Long id) {
        return bookRepository.findById(id);
    }

    public List<Book> getAll() {
        return bookRepository.findAll();
    }
}
