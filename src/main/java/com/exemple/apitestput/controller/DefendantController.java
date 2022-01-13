package com.exemple.apitestput.controller;

import com.exemple.apitestput.models.Defendant;
import com.exemple.apitestput.services.DefendantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/defendant")
public class DefendantController {
    @Autowired
    private DefendantService defendantService;

    @GetMapping(path = "/defendants")
    public List<Defendant> listAll(){
        return defendantService.getAll();
    }

    @GetMapping("/defendant/{id}")
    public Optional<Defendant> findById(@PathVariable Long id){
        return defendantService.findById(id);
    }

    @PostMapping(path = "/defendant")
    @ResponseStatus(HttpStatus.CREATED)
    public Defendant newPost(@RequestBody Defendant defendant){
        return defendantService.saveOne(defendant);
    }
}