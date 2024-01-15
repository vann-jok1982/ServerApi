package com.example.ServerApi.controllers;

import com.example.ServerApi.models.Book;
import com.example.ServerApi.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping()
    public List<Book> SpisVsehPeople(){
        //   model.addAttribute("book",bookService.findAll());
        return bookService.findAll();
    }
    @PostMapping()
    public ResponseEntity<HttpStatus> create(@RequestBody  Book book, BindingResult bindingResult){
        bookService.save(book);
        return ResponseEntity.ok(HttpStatus.OK);
    }
}
