package com.exemple.apitestput.services;

import com.exemple.apitestput.models.Lawyer;
import com.exemple.apitestput.models.Procedure;
import com.exemple.apitestput.repositories.LawyerRepository;
import com.exemple.apitestput.repositories.ProcedureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProcedureService {

    @Autowired
    private ProcedureRepository procedureRepository;

    public Procedure saveOne(Procedure obj){
        return procedureRepository.save(obj);
    }

    public List<Procedure> getAll(){
        return procedureRepository.findAll();
    }

    public Optional<Procedure> findById(Long id){
        Optional<Procedure> procedure = procedureRepository.findById(id);
        return procedure;
    }
}