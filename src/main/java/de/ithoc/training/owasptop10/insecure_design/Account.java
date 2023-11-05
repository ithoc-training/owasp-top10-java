package de.ithoc.training.owasptop10.insecure_design;

import lombok.Data;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


@Data
public class Account {

    private BigDecimal balance;
    private String accountNumber;
    private List<Booking> bookings = new ArrayList<>();

}
