package com.pri.bankingwebapp.bankingApplication.service.impl;

import com.pri.bankingwebapp.bankingApplication.dto.AccountDto;
import com.pri.bankingwebapp.bankingApplication.entity.Account;
import com.pri.bankingwebapp.bankingApplication.mapper.AccountMapper;
import com.pri.bankingwebapp.bankingApplication.repository.AccountRepository;
import com.pri.bankingwebapp.bankingApplication.service.AccountService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static com.pri.bankingwebapp.bankingApplication.mapper.AccountMapper.mapToAccountDto;

@Service
public class AccountServiceImpll implements AccountService {

    AccountRepository accountRepository;

    public AccountServiceImpll(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public AccountDto createAccount(AccountDto accountDto) {

        Account account = AccountMapper.mapToAccount(accountDto);
        Account savedAccount = accountRepository.save(account);
        return mapToAccountDto(savedAccount);
    }

    @Override
    public List<AccountDto> getAllUser() {
//        List<Account> allAccount = accountRepository.findAll();
        List<AccountDto> accountDtos = new ArrayList<>();
        for(Account account : accountRepository.findAll()) {
            AccountDto accountDto = mapToAccountDto(account);
            accountDtos.add(accountDto);
        }
        return accountDtos;
    }
}
