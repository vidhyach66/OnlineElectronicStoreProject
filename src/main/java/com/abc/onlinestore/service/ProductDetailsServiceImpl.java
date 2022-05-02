package com.abc.onlinestore.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.onlinestore.entity.ProductDetails;
import com.abc.onlinestore.repository.ProductDetailsRepository;
@Service
public class ProductDetailsServiceImpl  implements ProductDetailsService{
	 @Autowired
	 ProductDetailsRepository productRepository;
	 

	 @Override
	 public List<ProductDetails> getallProductDetails() {
	  // TODO Auto-generated method stub
	  return productRepository.findAll();
	 }

	}
