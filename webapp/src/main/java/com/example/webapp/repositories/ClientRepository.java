package com.example.webapp.repositories;

import com.example.webapp.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {
    public Client findByEmail(String email);
}
