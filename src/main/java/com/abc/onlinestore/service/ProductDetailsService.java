package com.abc.onlinestore.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.abc.onlinestore.entity.ProductDetails;

@Service
public interface ProductDetailsService {
 public List<ProductDetails>getallProductDetails();

}
