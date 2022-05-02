package com.abc.onlinestore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abc.onlinestore.entity.OrderDetails;
@Repository
public interface OrderDetailsRepository extends JpaRepository<OrderDetails,Integer> {

}