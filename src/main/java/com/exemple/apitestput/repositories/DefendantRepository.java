package com.exemple.apitestput.repositories;

import com.exemple.apitestput.models.Defendant;
import com.exemple.apitestput.models.Proccess;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DefendantRepository extends JpaRepository<Defendant, String> {

}
