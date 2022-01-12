package com.exemple.apitestput.services;

import com.exemple.apitestput.models.Document;
import com.exemple.apitestput.models.Judge;
import com.exemple.apitestput.models.Proccess;
import com.exemple.apitestput.repositories.DocumentRepository;
import com.exemple.apitestput.repositories.JudgeRepository;
import com.exemple.apitestput.repositories.ProccessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

public class JudgeService {

    @Autowired
    private JudgeRepository judgeRepository;
    public Judge updateJudge(@RequestBody Judge obj){
        return judgeRepository.save(obj);
    }
}
