package com.parfenov.northwind_purdue.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "customers")
public class Customer {
  @Id
  @Column(name = "CustomerID", length = 5, nullable = false)
  private String customerId;

  @Column(name = "CompanyName", length = 40, nullable = false)
  private String companyName;

  @Column(name = "ContactName", length = 30)
  private String contactName;

  @Column(name = "ContactTitle", length = 30)
  private String contactTitle;

  @Column(name = "Address", length = 60)
  private String address;

  @Column(name = "City", length = 15)
  private String city;

  @Column(name = "Region", length = 15)
  private String region;

  @Column(name = "PostalCode", length = 10)
  private String postalCode;

  @Column(name = "Country", length = 15)
  private String country;

  @Column(name = "Phone", length = 24)
  private String phone;

  @Column(name = "Fax", length = 24)
  private String fax;
}
