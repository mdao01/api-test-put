package com.exemple.apitestput.services;

import com.exemple.apitestput.models.Defendant;
import com.exemple.apitestput.repositories.DefendantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DefendantService {

    @Autowired
    private DefendantRepository defendantRepository;

    public Defendant saveOne(Defendant obj){
        return defendantRepository.save(obj);
    }

    public List<Defendant> getAll(){
        return defendantRepository.findAll();
    }

    public Optional<Defendant> findById(Long id){
        Optional<Defendant> defendant = defendantRepository.findById(id);
        return defendant;
    }
}