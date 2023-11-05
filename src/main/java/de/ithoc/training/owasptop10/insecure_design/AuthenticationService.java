package de.ithoc.training.owasptop10.insecure_design;


import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;


@Service
public class AuthenticationService {

    private final Map<String, String> userCredentials = new HashMap<>();

    public AuthenticationService() {
        userCredentials.put("clerk", "password123");
        userCredentials.put("admin", "adminpassword");
        userCredentials.put("userA", "passwordA");
        userCredentials.put("userB", "passwordB");
    }


    @SuppressWarnings("unused")
    public boolean authenticate(String username, String password) {

        return userCredentials.getOrDefault(username, "").equals(password);
    }

}
