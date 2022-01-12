package com.exemple.apitestput.repositories;

import com.exemple.apitestput.models.Judge;
import com.exemple.apitestput.models.Proccess;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JudgeRepository extends JpaRepository<Judge, String> {

}
