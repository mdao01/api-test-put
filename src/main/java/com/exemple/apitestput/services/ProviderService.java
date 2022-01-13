package com.exemple.apitestput.services;

import com.exemple.apitestput.models.Provider;
import com.exemple.apitestput.repositories.ProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProviderService {

    @Autowired
    private ProviderRepository providerRepository;

    public Provider saveOne(Provider obj){
        return providerRepository.save(obj);
    }

    public List<Provider> getAll(){
        return providerRepository.findAll();
    }

    public Optional<Provider> findById(Long id){
        Optional<Provider> provider = providerRepository.findById(id);
        return provider;
    }
}