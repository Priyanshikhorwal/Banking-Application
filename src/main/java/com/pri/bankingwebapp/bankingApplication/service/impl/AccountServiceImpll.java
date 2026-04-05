package com.pri.bankingwebapp.bankingApplication.service.impl;

import com.pri.bankingwebapp.bankingApplication.dto.AccountDto;
import com.pri.bankingwebapp.bankingApplication.entity.Account;
import com.pri.bankingwebapp.bankingApplication.mapper.AccountMapper;
import com.pri.bankingwebapp.bankingApplication.repository.AccountRepository;
import com.pri.bankingwebapp.bankingApplication.service.AccountService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

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
        return AccountMapper.mmapToAccountDto(savedAccount);
    }

    @Override
    public List<AccountDto> getAllUser(List<AccountDto> accountDtos) {
        List<AccountDto> allAccount = accountRepository.findAll();
        return ResponseEntity.ok(allAccount);
    }
}
