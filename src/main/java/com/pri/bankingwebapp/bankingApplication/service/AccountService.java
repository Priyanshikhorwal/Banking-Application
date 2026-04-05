package com.pri.bankingwebapp.bankingApplication.service;

import com.pri.bankingwebapp.bankingApplication.dto.AccountDto;
import com.pri.bankingwebapp.bankingApplication.entity.Account;
import com.pri.bankingwebapp.bankingApplication.repository.AccountRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;


public interface AccountService  {



    AccountDto createAccount(AccountDto accountdto);

    List<AccountDto> getAllUser();
}
