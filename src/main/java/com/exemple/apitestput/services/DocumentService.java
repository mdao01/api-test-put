package com.exemple.apitestput.services;

import com.exemple.apitestput.models.Defendant;
import com.exemple.apitestput.models.Document;
import com.exemple.apitestput.models.Proccess;
import com.exemple.apitestput.repositories.DefendantRepository;
import com.exemple.apitestput.repositories.DocumentRepository;
import com.exemple.apitestput.repositories.ProccessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

public class DocumentService {

    @Autowired
    private DocumentRepository documentRepository;
    public Document updateDefendant(@RequestBody Document obj){
        return documentRepository.save(obj);
    }
}
