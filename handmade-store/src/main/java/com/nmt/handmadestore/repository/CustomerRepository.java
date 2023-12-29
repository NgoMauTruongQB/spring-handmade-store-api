package com.nmt.handmadestore.repository;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nmt.handmadestore.models.Customer;


@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {

    List<Customer> findByUsername(String username);
    
}
