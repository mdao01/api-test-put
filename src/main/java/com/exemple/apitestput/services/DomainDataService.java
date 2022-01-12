package com.exemple.apitestput.services;

import com.exemple.apitestput.models.Document;
import com.exemple.apitestput.models.DomainData;
import com.exemple.apitestput.models.Proccess;
import com.exemple.apitestput.repositories.DocumentRepository;
import com.exemple.apitestput.repositories.DomainDataRepository;
import com.exemple.apitestput.repositories.ProccessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

public class DomainDataService {

    @Autowired
    private DomainDataRepository domainDataRepository;
    public DomainData updateDomainData(@RequestBody DomainData obj){
        return domainDataRepository.save(obj);
    }
}
