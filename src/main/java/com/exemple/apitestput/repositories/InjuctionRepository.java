package com.exemple.apitestput.repositories;

import com.exemple.apitestput.models.Injuction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InjuctionRepository extends JpaRepository<Injuction, Long> {
}
