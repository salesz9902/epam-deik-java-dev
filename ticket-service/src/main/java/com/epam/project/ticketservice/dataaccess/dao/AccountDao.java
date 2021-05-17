package com.epam.project.ticketservice.dataaccess.dao;

import com.epam.project.ticketservice.dataaccess.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface AccountDao extends JpaRepository<Account, UUID> {
    Optional<Account> findByUserName(String name);
}
