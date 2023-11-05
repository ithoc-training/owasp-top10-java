package de.ithoc.training.owasptop10.insecure_design;

import org.springframework.stereotype.Service;
import java.math.BigDecimal;


@Service
public class AccountService {


    public void transferFunds(User user, Account fromAccount, Account toAccount, BigDecimal amount) {

        if (user.isLoggedIn()) {
            performTransfer(fromAccount, toAccount, amount);
        }
    }


    private void performTransfer(Account from, Account to, BigDecimal amount) {

        // withdraw from
        from.setBalance(from.getBalance().subtract(amount));

        Booking bookingFrom = new Booking();
        bookingFrom.setFromIban(from.getAccountNumber());
        bookingFrom.setToIban(to.getAccountNumber());
        bookingFrom.setDate("2023-11-05");
        bookingFrom.setAmount(amount.multiply(BigDecimal.valueOf(-1)));
        from.getBookings().add(bookingFrom);

        // transfer to
        to.setBalance(to.getBalance().add(amount));

        Booking bookingTo = new Booking();
        bookingTo.setFromIban(from.getAccountNumber());
        bookingTo.setToIban(to.getAccountNumber());
        bookingTo.setDate("2023-11-05");
        bookingTo.setAmount(amount);
        to.getBookings().add(bookingTo);
    }

}
