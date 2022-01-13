package com.exemple.apitestput.repositories;

import com.exemple.apitestput.models.Action;
import com.exemple.apitestput.models.Cause;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CauseRepository extends JpaRepository<Cause, Long> {
}
