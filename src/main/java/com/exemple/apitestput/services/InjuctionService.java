package com.exemple.apitestput.services;

import com.exemple.apitestput.models.Defendant;
import com.exemple.apitestput.models.Injuction;
import com.exemple.apitestput.repositories.InjuctionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InjuctionService {

    @Autowired
    private InjuctionRepository injuctionRepository;

    public Injuction saveOne(Injuction obj){
        return injuctionRepository.save(obj);
    }

    public List<Injuction> getAll(){
        return injuctionRepository.findAll();
    }

    public Optional<Injuction> findById(Long id){
        Optional<Injuction> injuction = injuctionRepository.findById(id);
        return injuction;
    }
}