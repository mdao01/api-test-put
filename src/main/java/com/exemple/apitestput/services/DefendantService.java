package com.exemple.apitestput.services;

import com.exemple.apitestput.models.Author;
import com.exemple.apitestput.models.Defendant;
import com.exemple.apitestput.models.Proccess;
import com.exemple.apitestput.repositories.AuthorRepository;
import com.exemple.apitestput.repositories.DefendantRepository;
import com.exemple.apitestput.repositories.ProccessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

public class DefendantService {

    @Autowired
    private DefendantRepository defendantRepository;
    public Defendant updateDefendant(@RequestBody Defendant obj){
        return defendantRepository.save(obj);
    }
}
