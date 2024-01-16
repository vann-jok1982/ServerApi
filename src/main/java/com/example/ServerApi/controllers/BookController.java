package com.example.ServerApi.controllers;

import com.example.ServerApi.models.Book;
import com.example.ServerApi.models.ImageEntity;
import com.example.ServerApi.repositories.ImageRepository;
import com.example.ServerApi.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;

    @Autowired
    private ImageRepository imageRepository;

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
    @PostMapping("/upload")
    public String handleFileUpload(@RequestParam("file") MultipartFile file) throws IOException {
        if (!file.isEmpty()) {
            ImageEntity imageEntity = new ImageEntity();
            imageEntity.setImagedata(file.getBytes());
            System.out.println(file.getContentType());
            imageRepository.save(imageEntity);
            return "File uploaded successfully!";
        } else {
            return "Failed to upload file as it was empty.";
        }
    }

}
