package com.exemple.apitestput.controller;

import com.exemple.apitestput.models.Author;
import com.exemple.apitestput.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/author")
public class AuthorController {
    @Autowired
    private AuthorService authorService;

    @GetMapping(path = "/authors")
    public List<Author> listAll(){
        return authorService.getAll();
    }

    @GetMapping("/author/{id}")
    public Optional<Author> postAuthor(@PathVariable Long id){
        return authorService.findById(id);
    }

    @PostMapping(path = "/author")
    @ResponseStatus(HttpStatus.CREATED)
    public Author postAuthor(@RequestBody Author author){

        return authorService.saveOne(author);
    }
}