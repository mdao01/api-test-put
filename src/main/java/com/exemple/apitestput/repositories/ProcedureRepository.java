package com.exemple.apitestput.repositories;

import com.exemple.apitestput.models.Lawyer;
import com.exemple.apitestput.models.Procedure;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProcedureRepository extends JpaRepository<Procedure, Long> {

}
