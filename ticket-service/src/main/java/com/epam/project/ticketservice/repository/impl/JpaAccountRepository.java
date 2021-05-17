package com.epam.project.ticketservice.repository.impl;

import com.epam.project.ticketservice.dataaccess.dao.AccountDao;
import com.epam.project.ticketservice.dataaccess.model.Account;
import com.epam.project.ticketservice.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class JpaAccountRepository implements AccountRepository {

    @Autowired
    private AccountDao accountDao;

    @Override
    public Account getUserName(String name) {
        Optional<Account> account = accountDao.findByUserName(name);
        if (!account.isPresent()) {
            return null;
        }
        return account.get();
    }
}
