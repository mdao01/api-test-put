package com.exemple.apitestput.controller;

import com.exemple.apitestput.models.Injuction;
import com.exemple.apitestput.services.InjuctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/injuction")
public class InjuctionController {
    @Autowired
    private InjuctionService injuctionService;

    @GetMapping(path = "/injuctions")
    public List<Injuction> listAll(){
        return injuctionService.getAll();
    }

    @GetMapping("/injuction/{id}")
    public Optional<Injuction> findById(@PathVariable Long id){
        return injuctionService.findById(id);
    }

    @PostMapping(path = "/injuction")
    @ResponseStatus(HttpStatus.CREATED)
    public Injuction newPost(@RequestBody Injuction injuction){
        return injuctionService.saveOne(injuction);
    }
}