package com.parfenov.northwind_purdue.controller;

import com.parfenov.northwind_purdue.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class CustomerController {
  private final CustomerService customerService;

  @GetMapping("/customers")
  public String showCustomerList(Model model) {
    model.addAttribute("customerCount", customerService.getCustomerCount());
    model.addAttribute("customerNames", customerService.findAllNames());
    model.addAttribute("customerLastnames", customerService.findAllLastnames());
    return "customer_list";
  }
}
