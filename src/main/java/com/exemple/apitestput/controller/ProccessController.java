package com.exemple.apitestput.controller;

import com.exemple.apitestput.models.Proccess;
import com.exemple.apitestput.services.ProccessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/proccess")
public class ProccessController {
    @Autowired
    private ProccessService proccessService;

    @GetMapping(path = "/proccesses")
    public List<Proccess> listAll(){
        return proccessService.getAll();
    }

    @GetMapping("/proccess/{id}")
    public Optional<Proccess> findById(@PathVariable Long id){
        return proccessService.findById(id);
    }

    @PostMapping(path = "/proccess")
    @ResponseStatus(HttpStatus.CREATED)
    public Proccess newPost(@RequestBody Proccess proccess){
        return proccessService.saveOne(proccess);
    }
}
