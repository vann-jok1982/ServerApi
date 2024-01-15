package com.example.ServerApi.services;

import com.example.ServerApi.models.Book;
import com.example.ServerApi.repositories.BookRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class BookService {
    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    public List<Book> findAll(){
        return bookRepository.findAll();
    }
    public Book findOne(int id){
        Optional<Book> foundBook=bookRepository.findById(id);
        return foundBook.orElse(null);
    }
    @Transactional
    public void save(Book book){
        bookRepository.save(book);
    }
    @Transactional
    public void update(int id,Book updateBook ){
        updateBook.setId(id);
        bookRepository.save(updateBook);
    }
    @Transactional
    public void delete(int id){
        bookRepository.deleteById(id);
    }
}
