package com.parfenov.northwind_purdue.repository;

import com.parfenov.northwind_purdue.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {
  long count();
}
