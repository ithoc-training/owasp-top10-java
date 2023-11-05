package de.ithoc.training.owasptop10.insecure_design;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;


@Configuration
public class AccountStorage {


    @Bean
    public Account accountUserA() {

        Account account = new Account();
        account.setAccountNumber("1234567890A");
        account.setBalance(BigDecimal.valueOf(1000.0));

        return account;
    }


    @Bean
    public Account accountUserB() {

        Account account = new Account();
        account.setAccountNumber("1234567890B");
        account.setBalance(BigDecimal.valueOf(2000.0));

        return account;
    }

}
