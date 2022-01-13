package com.exemple.apitestput.services;

import com.exemple.apitestput.models.Author;
import com.exemple.apitestput.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorService {

    @Autowired
    private AuthorRepository authorRepository;

    public Author saveOne(Author obj){
        return authorRepository.save(obj);
    }

    public List<Author> getAll(){
        return authorRepository.findAll();
    }


    public Optional<Author> findById(Long id){
        Optional<Author> author = authorRepository.findById(Long.valueOf(id));
        return author;
    }
}