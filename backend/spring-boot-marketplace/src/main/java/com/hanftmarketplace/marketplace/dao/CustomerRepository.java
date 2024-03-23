package com.hanftmarketplace.marketplace.dao;

import com.hanftmarketplace.marketplace.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
