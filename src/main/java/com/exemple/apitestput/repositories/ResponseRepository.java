package com.exemple.apitestput.repositories;

import com.exemple.apitestput.models.Proccess;
import com.exemple.apitestput.models.Response;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResponseRepository extends JpaRepository<Response, String> {

}
