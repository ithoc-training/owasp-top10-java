package de.ithoc.training.owasptop10.insecure_design;

import lombok.Data;

import java.math.BigDecimal;


@Data
public class Booking {

    private String date; // Format: YYYY-MM-DD
    private String fromIban;
    private String toIban;
    private BigDecimal amount;

}
