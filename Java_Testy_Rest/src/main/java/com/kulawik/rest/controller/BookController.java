package com.kulawik.rest.controller;

import com.kulawik.rest.domain.BookDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
class BookController {

    @GetMapping
    public List<BookDto> getBooks() { return new ArrayList<>(); }
}