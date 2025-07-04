package com.library.service;

import com.library.repository.BookRepository;

public class BookServiceTest {
    public static void main(String[] args) {
        BookRepository repo = new BookRepository();
        BookService service = new BookService();
        service.setBookRepository(repo);
        service.addBook("Effective Java");
    }
}
