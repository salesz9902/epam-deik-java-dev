package com.epam.project.ticketservice.dataaccess.configuration;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories("com.epam.project.ticketservice.dataaccess.dao")
@EntityScan("com.epam.project.ticketservice.dataaccess.model")
@EnableTransactionManagement
public class JpaConfiguration {

}