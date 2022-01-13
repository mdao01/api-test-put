package com.exemple.apitestput.controller;

import com.exemple.apitestput.models.Lawyer;
import com.exemple.apitestput.models.Procedure;
import com.exemple.apitestput.services.LawyerService;
import com.exemple.apitestput.services.ProcedureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/procedure")
public class ProcedureController {
    @Autowired
    private ProcedureService procedureService;

    @GetMapping(path = "/procedures")
    public List<Procedure> listAll(){
        return procedureService.getAll();
    }

    @GetMapping("/procedure/{id}")
    public Optional<Procedure> findById(@PathVariable Long id){
        return procedureService.findById(id);
    }

    @PostMapping(path = "/procedure")
    @ResponseStatus(HttpStatus.CREATED)
    public Procedure newPost(@RequestBody Procedure procedure){
        return procedureService.saveOne(procedure);
    }
}