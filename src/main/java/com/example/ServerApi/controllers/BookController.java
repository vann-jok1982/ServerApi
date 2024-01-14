package com.example.ServerApi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {
//    @Autowired
//    private BookService bookService;
//
//    @GetMapping()
//    public List<Book> SpisVsehPeople(){
//     //   model.addAttribute("book",bookService.findAll());
//        return bookService.findAll();
//    }
//    @GetMapping("/{id}")
//    public String PokazOdnoyBook(@PathVariable("id") int id, Model model){
//        model.addAttribute("book",bookService.findOne(id));
//        return "book/PokazOdnoyBook";
//    }
//    @GetMapping("/new")
//    public String newBook(Model model){
//        model.addAttribute("book",new Book());
//        return "book/new";
//    }
//    @PostMapping()
//    public String create(@ModelAttribute("book")  Book book, BindingResult bindingResult){
//        bookService.save(book);
//        return "redirect:/book";
//    }
}
