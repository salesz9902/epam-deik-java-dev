package com.epam.project.ticketservice.dataaccess;

import com.epam.project.ticketservice.dataaccess.dao.AccountDao;
import com.epam.project.ticketservice.dataaccess.model.Account;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class AccountCreator {

    private final AccountDao accountDao;

    public AccountCreator(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @PostConstruct
    public void initAdmin() {
        accountDao.save(new Account("admin", "admin"));
    }
}
