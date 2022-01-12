package com.exemple.apitestput.repositories;

import com.exemple.apitestput.models.Document;
import com.exemple.apitestput.models.Proccess;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentRepository extends JpaRepository<Document, String> {

}
