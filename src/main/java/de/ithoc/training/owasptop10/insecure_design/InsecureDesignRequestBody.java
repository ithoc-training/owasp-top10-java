package de.ithoc.training.owasptop10.insecure_design;

import lombok.Data;
import java.math.BigDecimal;


@Data
public class InsecureDesignRequestBody {

    private User user;
    private String fromIban;
    private String toIban;
    private BigDecimal amount;

}
