package com.exemple.apitestput.services;

import com.exemple.apitestput.models.Document;
import com.exemple.apitestput.models.Proccess;
import com.exemple.apitestput.models.Response;
import com.exemple.apitestput.repositories.DocumentRepository;
import com.exemple.apitestput.repositories.ProccessRepository;
import com.exemple.apitestput.repositories.ResponseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

public class ResponseService {

    @Autowired
    private ResponseRepository responseRepository;
    public Response updateResponse(@RequestBody Response obj){
        return responseRepository.save(obj);
    }
}
