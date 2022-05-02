package com.abc.onlinestore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abc.onlinestore.entity.UserDetails;
@Repository
public interface UserDetailsRepository extends JpaRepository<UserDetails, Integer> {

}