package com.epam.project.ticketservice.service;

import com.epam.project.ticketservice.dataaccess.exceptions.AccountDoesNotExistException;
import com.epam.project.ticketservice.dataaccess.exceptions.WrongPasswordException;
import com.epam.project.ticketservice.dataaccess.model.Account;
import com.epam.project.ticketservice.repository.AccountRepository;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class AccountService {
    private AccountRepository accountRepository;

    public void signIn(String userName, String password) throws AccountDoesNotExistException, WrongPasswordException {
        Account account = accountRepository.getUserName(userName);
        if (Objects.isNull(account)) {
            throw new AccountDoesNotExistException();
        }
        if (!account.getPassword().equals(password)) {
            throw new WrongPasswordException();
        }
    }

}
