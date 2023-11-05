package de.ithoc.training.owasptop10.insecure_design;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {

    private String username;
    private String password;
    private boolean loggedIn;

}
