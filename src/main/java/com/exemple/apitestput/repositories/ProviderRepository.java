package com.exemple.apitestput.repositories;

import com.exemple.apitestput.models.Procedure;
import com.exemple.apitestput.models.Provider;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProviderRepository extends JpaRepository<Provider, Long> {
}
