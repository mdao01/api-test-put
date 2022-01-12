package com.exemple.apitestput.repositories;

import com.exemple.apitestput.models.DomainData;
import com.exemple.apitestput.models.Proccess;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DomainDataRepository extends JpaRepository<DomainData, String> {

}
