package com.abc.onlinestore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abc.onlinestore.entity.ProductDetails;
@Repository
public interface ProductDetailsRepository extends JpaRepository<ProductDetails,Integer> {
 

}