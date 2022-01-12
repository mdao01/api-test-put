package com.exemple.apitestput.repositories;

import com.exemple.apitestput.models.Lawyer;
import com.exemple.apitestput.models.Proccess;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LawyerRepository extends JpaRepository<Lawyer, String> {

}
