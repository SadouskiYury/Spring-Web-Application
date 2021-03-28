package com.example.spring.jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping("/add")
    public String addCustomer(@RequestParam String first, @RequestParam String last) {
        User user = new User();
        user.setFirstName(first);
        user.setLastName(last);
        customerRepository.save(user);
        return String.format("Successfully Added new user: %s %s!", first, last);
    }

    @GetMapping("/list")
    public Iterable<User> getCustomers() {
        return customerRepository.findAll();
    }

    @GetMapping("/find")
    public User findCustomerById(@RequestParam Integer id) {
        return customerRepository.findCustomerById(id);
    }


}
