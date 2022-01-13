package com.exemple.apitestput.services;

import com.exemple.apitestput.models.Judge;
import com.exemple.apitestput.models.Lawyer;
import com.exemple.apitestput.repositories.JudgeRepository;
import com.exemple.apitestput.repositories.LawyerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LawyerService {

    @Autowired
    private LawyerRepository lawyerRepository;

    public Lawyer saveOne(Lawyer obj){
        return lawyerRepository.save(obj);
    }

    public List<Lawyer> getAll(){
        return lawyerRepository.findAll();
    }

    public Optional<Lawyer> findById(Long id){
        Optional<Lawyer> lawyer = lawyerRepository.findById(id);
        return lawyer;
    }
}