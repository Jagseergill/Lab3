package com.example.lab3.DAO;

import com.example.lab3.Entity.Book;
import com.example.lab3.Entity.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class BookDAO {

    @Autowired
    private BookRepository repository;
    public Collection<Book> getBooks(){
        return repository.findAll();
    }
    public Book createBook(Book book){
        return (Book) repository.insert(book);
    }
}
