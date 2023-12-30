package com.nmt.handmadestore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.nmt.handmadestore.models.Customer;
import com.nmt.handmadestore.repository.CustomerRepository;

@Service
public class CustomerService {

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    CustomerRepository customerRepository;

    public Customer createCustomer(Customer customer) {
        String password = passwordEncoder.encode(customer.getPassword());
        customer.setPassword(password);
        
        return customerRepository.save(customer);
    }
}
