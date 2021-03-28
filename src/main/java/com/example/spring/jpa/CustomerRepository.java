package com.example.spring.jpa;

import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<User, Integer> {

    User findCustomerById(Integer id);
}