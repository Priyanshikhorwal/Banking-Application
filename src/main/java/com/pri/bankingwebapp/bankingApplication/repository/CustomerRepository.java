package com.pri.bankingwebapp.bankingApplication.repository;

import com.pri.bankingwebapp.bankingApplication.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
