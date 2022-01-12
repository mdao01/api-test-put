package com.exemple.apitestput.services;

import com.exemple.apitestput.models.Document;
import com.exemple.apitestput.models.Proccess;
import com.exemple.apitestput.repositories.DocumentRepository;
import com.exemple.apitestput.repositories.ProccessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

public class ProccessService {

    @Autowired
    private ProccessRepository proccessRepository;
    public Proccess updateProccess(@RequestBody Proccess obj){
        return proccessRepository.save(obj);
    }
}
