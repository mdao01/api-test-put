package com.exemple.apitestput.controller;

import com.exemple.apitestput.models.Procedure;
import com.exemple.apitestput.models.Provider;
import com.exemple.apitestput.services.ProcedureService;
import com.exemple.apitestput.services.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/provider")
public class ProviderController {
    @Autowired
    private ProviderService providerService;

    @GetMapping(path = "/providers")
    public List<Provider> listAll(){
        return providerService.getAll();
    }

    @GetMapping("/provider/{id}")
    public Optional<Provider> findById(@PathVariable Long id){
        return providerService.findById(id);
    }

    @PostMapping(path = "/procedure")
    @ResponseStatus(HttpStatus.CREATED)
    public Provider newPost(@RequestBody Provider provider){
        return providerService.saveOne(provider);
    }
}