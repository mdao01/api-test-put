package com.exemple.apitestput.controller;

import com.exemple.apitestput.models.Action;
import com.exemple.apitestput.models.Author;
import com.exemple.apitestput.services.ActionService;
import com.exemple.apitestput.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/action")
public class ActionController {
    @Autowired
    private ActionService actionService;

    @GetMapping(path = "/actions")
    public List<Action> listAll(){
        return actionService.getAll();
    }

    @GetMapping("/action/{id}")
    public Optional<Action> findById(@PathVariable Long id){
        return actionService.findById(String.valueOf(id));
    }

    @PostMapping(path = "/action")
    @ResponseStatus(HttpStatus.CREATED)
    public Action newPost(@RequestBody Action action){
        return actionService.saveOne(action);
    }
}