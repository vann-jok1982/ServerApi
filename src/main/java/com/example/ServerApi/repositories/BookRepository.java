package com.example.ServerApi.repositories;

import com.example.ServerApi.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookRepository extends JpaRepository<Book,Integer> {
}
