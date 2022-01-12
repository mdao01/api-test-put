package com.exemple.apitestput.repositories;

import com.exemple.apitestput.models.Author;
import com.exemple.apitestput.models.Proccess;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
}
