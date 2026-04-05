package com.pri.bankingwebapp.bankingApplication.repository;

import com.pri.bankingwebapp.bankingApplication.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account,Long> {

}
