package com.exemple.apitestput.services;

import com.exemple.apitestput.models.Proccess;
import com.exemple.apitestput.repositories.ProccessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class ProccessService {

    @Autowired
    private ProccessRepository proccessRepository;

    public Proccess saveOne(@RequestBody Proccess obj){
        return proccessRepository.save(obj);
    }

    public List<Proccess> getAll(){
        return proccessRepository.findAll();
    }

    public Optional<Proccess> findById(Long id){
        Optional<Proccess> proccess = proccessRepository.findById(String.valueOf(id));
        return proccess;
    }
}
