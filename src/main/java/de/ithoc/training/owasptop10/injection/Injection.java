package de.ithoc.training.owasptop10.injection;


import jakarta.annotation.PostConstruct;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.UUID;

@RestController
public class Injection {

    private final CustomerRepository customerRepository;

    @PersistenceContext
    private EntityManager entityManager;

    public Injection(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }


    @GetMapping("/injection")
    public ResponseEntity<Collection<Customer>> get(@RequestParam String customerId) {
        System.out.println("customerId: " + customerId);

        String sql = "SELECT * FROM customer WHERE id = '" + customerId + "'";
        Query nativeQuery = entityManager.createNativeQuery(sql);
        List resultList = nativeQuery.getResultList();

        return ResponseEntity.ok().build();
    }


    @PostConstruct
    public void init() {

        for (int i = 0; i < 3; i++) {
            Customer customer = new Customer();
            customer.setEmail(UUID.randomUUID() + "@example.com");
            customer.setTurnover(new Random().nextInt(10000));
            customerRepository.save(customer);
        }
    }

}
