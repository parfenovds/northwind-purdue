package com.parfenov.northwind_purdue.mapper;

import com.parfenov.northwind_purdue.dto.CustomerDTO;
import com.parfenov.northwind_purdue.entity.Customer;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMapper extends BaseMapper<Customer, CustomerDTO> {
  @Mapping(source = "contactName", target = "contactName")
  CustomerDTO toDTO(Customer customer);

  List<CustomerDTO> toDTOs(List<Customer> customers);

  Customer toEntity(CustomerDTO dto);
}