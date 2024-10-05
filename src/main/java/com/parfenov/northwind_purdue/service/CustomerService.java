package com.parfenov.northwind_purdue.service;

import com.parfenov.northwind_purdue.dto.CustomerDTO;
import com.parfenov.northwind_purdue.dto.CustomerLastnameDTO;
import com.parfenov.northwind_purdue.dto.CustomerNameDTO;
import com.parfenov.northwind_purdue.entity.Customer;
import com.parfenov.northwind_purdue.mapper.CustomerLastnamesMapper;
import com.parfenov.northwind_purdue.mapper.CustomerMapper;
import com.parfenov.northwind_purdue.mapper.CustomerNamesMapper;
import com.parfenov.northwind_purdue.repository.CustomerRepository;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CustomerService implements BaseService<String, CustomerDTO> {
  private final CustomerRepository customerRepository;
  private final CustomerMapper customerMapper;
  private final CustomerNamesMapper customerNamesMapper;
  private final CustomerLastnamesMapper customerLastnamesMapper;

  @Override
  public CustomerDTO findById(String id) {
    Customer entity = customerRepository.findById(id).orElseThrow(() -> new RuntimeException("Entity not found"));
    return customerMapper.toDTO(entity);
  }

  public List<CustomerDTO> findAll() {
    return customerMapper.toDTOs(customerRepository.findAll());
  }

  public List<CustomerNameDTO> findAllNames() {
    return customerNamesMapper.toDTOs(customerRepository.findAll());
  }

  public List<CustomerLastnameDTO> findAllLastnames() {
    return customerLastnamesMapper.toDTOs(customerRepository.findAll());
  }

  public long getCustomerCount() {
    return customerRepository.count();
  }

  private List<String> getLastnames(List<Customer> customers) {
    return customers.stream().map(customer -> customer.getContactName().split(" ")[1]).toList();
  }
}
