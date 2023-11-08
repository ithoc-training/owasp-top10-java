package de.ithoc.training.owasptop10.insecure_design;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class InsecureDesignController {

    private final Account accountUserA;

    private final Account accountUserB;

    private final AccountService accountService;


    public InsecureDesignController(Account accountUserA, Account accountUserB, AccountService accountService) {
        this.accountUserA = accountUserA;
        this.accountUserB = accountUserB;
        this.accountService = accountService;
    }


    @PostMapping("/insecure-design")
    public ResponseEntity<List<Booking>> post(@RequestBody InsecureDesignRequestBody requestBody) {

        Account fromAccount = accountByIban(requestBody.getFromIban());
        Account toAccount = accountByIban(requestBody.getToIban());
        accountService.transferFunds(requestBody.getUser(), fromAccount, toAccount, requestBody.getAmount());

        return ResponseEntity.ok(fromAccount.getBookings());
    }


    private Account accountByIban(String iban) {

        if (accountUserA.getAccountNumber().equals(iban)) {
            return accountUserA;
        } else {
            return accountUserB;
        }
    }

}
