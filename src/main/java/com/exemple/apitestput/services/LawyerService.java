package com.exemple.apitestput.services;

import com.exemple.apitestput.models.Document;
import com.exemple.apitestput.models.Lawyer;
import com.exemple.apitestput.models.Proccess;
import com.exemple.apitestput.repositories.DocumentRepository;
import com.exemple.apitestput.repositories.LawyerRepository;
import com.exemple.apitestput.repositories.ProccessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

public class LawyerService {

    @Autowired
    private LawyerRepository lawyerRepository;
    public Lawyer updateLawyer(@RequestBody Lawyer obj){
        return lawyerRepository.save(obj);
    }
}
