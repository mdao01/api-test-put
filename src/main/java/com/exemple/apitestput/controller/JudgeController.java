package com.exemple.apitestput.controller;

import com.exemple.apitestput.models.Judge;
import com.exemple.apitestput.services.JudgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/judge")
public class JudgeController {
    @Autowired
    private JudgeService judgeService;

    @GetMapping(path = "/judges")
    public List<Judge> listAll(){
        return judgeService.getAll();
    }

    @GetMapping("/judge/{id}")
    public Optional<Judge> findById(@PathVariable Long id){
        return judgeService.findById(id);
    }

    @PostMapping(path = "/judge")
    @ResponseStatus(HttpStatus.CREATED)
    public Judge newPost(@RequestBody Judge judge){
        return judgeService.saveOne(judge);
    }
}