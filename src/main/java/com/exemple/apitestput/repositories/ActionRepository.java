package com.exemple.apitestput.repositories;

import com.exemple.apitestput.models.Action;
import com.exemple.apitestput.models.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActionRepository extends JpaRepository<Action, Long> {
}
