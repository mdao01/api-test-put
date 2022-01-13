package com.exemple.apitestput.services;

import com.exemple.apitestput.models.Action;
import com.exemple.apitestput.models.Cause;
import com.exemple.apitestput.repositories.ActionRepository;
import com.exemple.apitestput.repositories.CauseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CauseService {

    @Autowired
    private CauseRepository causeRepository;

    public Cause saveOne(Cause obj){
        return causeRepository.save(obj);
    }

    public List<Cause> getAll(){
        return causeRepository.findAll();
    }

    public Optional<Cause> findById(Long id){
        Optional<Cause> cause = causeRepository.findById(id);
        return cause;
    }
}