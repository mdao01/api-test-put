package com.exemple.apitestput.controller;

import com.exemple.apitestput.models.Judge;
import com.exemple.apitestput.models.Lawyer;
import com.exemple.apitestput.services.JudgeService;
import com.exemple.apitestput.services.LawyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/lawyer")
public class LawyerController {
    @Autowired
    private LawyerService lawyerService;

    @GetMapping(path = "/lawyers")
    public List<Lawyer> listAll(){
        return lawyerService.getAll();
    }

    @GetMapping("/lawyer/{id}")
    public Optional<Lawyer> findById(@PathVariable Long id){
        return lawyerService.findById(id);
    }

    @PostMapping(path = "/lawyer")
    @ResponseStatus(HttpStatus.CREATED)
    public Lawyer newPost(@RequestBody Lawyer lawyer){
        return lawyerService.saveOne(lawyer);
    }
}