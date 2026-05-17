package com.pri.bankingwebapp.bankingApplication.service.impl;

import com.pri.bankingwebapp.bankingApplication.dto.AccountDto;
import com.pri.bankingwebapp.bankingApplication.entity.Account;
import com.pri.bankingwebapp.bankingApplication.entity.Customer;
import com.pri.bankingwebapp.bankingApplication.mapper.AccountMapper;
import com.pri.bankingwebapp.bankingApplication.repository.AccountRepository;
import com.pri.bankingwebapp.bankingApplication.repository.CustomerRepository;
import com.pri.bankingwebapp.bankingApplication.service.AccountService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static com.pri.bankingwebapp.bankingApplication.mapper.AccountMapper.mapToAccountDto;

@Service
public class AccountServiceImpll implements AccountService {

    AccountRepository accountRepository;
    CustomerRepository customerRepository;

    public AccountServiceImpll(AccountRepository accountRepository , CustomerRepository customerRepository) {
        this.accountRepository = accountRepository;
        this.customerRepository = customerRepository;
    }

    @Override
    public AccountDto createAccount(Long customerId , AccountDto accountDto) {
        Customer customer = customerRepository.findById(customerId)
                .orElseThrow(()->
                        new RuntimeException("Customer Not Found"));
        Account account = AccountMapper.mapToAccount(accountDto);
        Account savedAccount = accountRepository.save(account);
        return mapToAccountDto(savedAccount);
    }

    @Override
    public Page<AccountDto> getAllUser(int page, int size) {
//        Page<Account> allAccount = accountRepository.findAll();
        Pageable  pageable = PageRequest.of(page, size);
        Page<Account> accounts = accountRepository.findAll(pageable);

        return accounts.map(AccountMapper::mapToAccountDto);
    }

    @Override
    public AccountDto updateById(Long id, AccountDto accountDto) {
        Account account = new Account();
        account.setId(id);
        account.setAccountHolderName(accountDto.getAccountHolderName());
        account.setBalance(accountDto.getBalance());
        return AccountMapper.mapToAccountDto(accountRepository.save(account));
    }
}
