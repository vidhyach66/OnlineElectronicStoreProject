package com.abc.onlinestore.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.onlinestore.entity.ProductDetails;
import com.abc.onlinestore.service.ProductDetailsService;


@RestController
@RequestMapping("/orders")
public class ProductDetailsRestController {
 @Autowired
 ProductDetailsService orderservice;

 public ProductDetailsRestController() {
  super();
  
  System.out.println("-----Inside Product Constructor");
 }
 
 @GetMapping("/allproducts")
 public List<ProductDetails> getallProductDetails()
 {
  return orderservice.getallProductDetails();
 }
 
}