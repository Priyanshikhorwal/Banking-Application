package com.pri.bankingwebapp.bankingApplication.service;

import com.pri.bankingwebapp.bankingApplication.dto.AccountDto;
import com.pri.bankingwebapp.bankingApplication.entity.Account;
import com.pri.bankingwebapp.bankingApplication.repository.AccountRepository;

public interface AccountService  {

    AccountDto createAccount(AccountDto accountdto);

}
