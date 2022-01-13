package com.exemple.apitestput.controller;

import com.exemple.apitestput.models.Cause;
import com.exemple.apitestput.services.CauseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cause")
public class CauseController {
    @Autowired
    private CauseService causeService;

    @GetMapping(path = "/causes")
    public List<Cause> listAll(){
        return causeService.getAll();
    }

    @GetMapping("/cause/{id}")
    public Optional<Cause> findById(@PathVariable Long id){
        return causeService.findById(id);
    }

    @PostMapping(path = "/cause")
    @ResponseStatus(HttpStatus.CREATED)
    public Cause newPost(@RequestBody Cause cause){
        return causeService.saveOne(cause);
    }
}