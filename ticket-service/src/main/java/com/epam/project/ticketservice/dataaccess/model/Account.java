package com.epam.project.ticketservice.dataaccess.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;


@Entity
public class Account {

    @Id
    @GeneratedValue
    private UUID id;

    private String userName;
    private String password;

    public Account(String userName, String password){
        this.userName = userName;
        this.password = password;
    }

    public Account() {

    }

    public String getUserName() { return userName; }
    public String getPassword() { return password; }

}
