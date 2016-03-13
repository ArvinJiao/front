package com.wezebra.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.wezebra.domain.Customer;


public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);
}
