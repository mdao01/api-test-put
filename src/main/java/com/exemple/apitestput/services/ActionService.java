package com.exemple.apitestput.services;

import com.exemple.apitestput.models.Action;
import com.exemple.apitestput.models.Author;
import com.exemple.apitestput.repositories.ActionRepository;
import com.exemple.apitestput.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ActionService {

    @Autowired
    private ActionRepository actionRepository;

    public Action saveOne(Action obj){
        return actionRepository.save(obj);
    }

    public List<Action> getAll(){
        return actionRepository.findAll();
    }

    public Optional<Action> findById(String id){
        Optional<Action> author = actionRepository.findById(Long.valueOf(id));
        return author;
    }
}