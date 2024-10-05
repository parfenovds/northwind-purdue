package com.parfenov.northwind_purdue.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerDTO implements BaseDTO{
  private String customerId;
  private String companyName;
  private String contactName;
  private String contactTitle;
  private String address;
  private String city;
  private String region;
  private String postalCode;
  private String country;
  private String phone;
  private String fax;
}