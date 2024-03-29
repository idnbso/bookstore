package com.bookstore.repository;

import org.springframework.data.repository.CrudRepository;

import com.bookstore.domain.Book;
import java.util.List;

public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findAll();
}
