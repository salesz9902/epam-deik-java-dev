package com.epam.project.ticketservice.repository;

import com.epam.project.ticketservice.dataaccess.model.Account;

public interface AccountRepository {
    Account getUserName(String name);
}
