package com.parfenov.northwind_purdue.mapper;

import com.parfenov.northwind_purdue.dto.CustomerNameDTO;
import com.parfenov.northwind_purdue.entity.Customer;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerNamesMapper extends BaseMapper<Customer, CustomerNameDTO> {
  @Mapping(source = "contactName", target = "contactName")
  CustomerNameDTO toDTO(Customer customer);

  List<CustomerNameDTO> toDTOs(List<Customer> customers);
}