package com.exemple.apitestput.services;

import com.exemple.apitestput.models.Injuction;
import com.exemple.apitestput.models.Judge;
import com.exemple.apitestput.repositories.InjuctionRepository;
import com.exemple.apitestput.repositories.JudgeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JudgeService {

    @Autowired
    private JudgeRepository judgeRepository;

    public Judge saveOne(Judge obj){
        return judgeRepository.save(obj);
    }

    public List<Judge> getAll(){
        return judgeRepository.findAll();
    }

    public Optional<Judge> findById(Long id){
        Optional<Judge> judge = judgeRepository.findById(id);
        return judge;
    }
}