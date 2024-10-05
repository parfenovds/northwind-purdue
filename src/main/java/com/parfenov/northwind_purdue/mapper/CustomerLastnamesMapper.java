package com.parfenov.northwind_purdue.mapper;

import com.parfenov.northwind_purdue.dto.CustomerLastnameDTO;
import com.parfenov.northwind_purdue.entity.Customer;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CustomerLastnamesMapper extends BaseMapper<Customer, CustomerLastnameDTO> {

  @Mapping(source = "contactName", target = "contactLastname", qualifiedByName = "extractLastName")
  CustomerLastnameDTO toDTO(Customer customer);

  List<CustomerLastnameDTO> toDTOs(List<Customer> customers);

  @Named("extractLastName")
  default String extractLastName(String fullName) {
    if (fullName != null && fullName.contains(" ")) {
      return fullName.split(" ")[1];
    }
    return fullName;
  }
}