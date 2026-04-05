package com.pri.bankingwebapp.bankingApplication.controller;

import com.pri.bankingwebapp.bankingApplication.dto.AccountDto;
import com.pri.bankingwebapp.bankingApplication.entity.Account;
import com.pri.bankingwebapp.bankingApplication.mapper.AccountMapper;
import com.pri.bankingwebapp.bankingApplication.service.AccountService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/account")
public class AccountController {

    AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<AccountDto>> getAccountAll() {

        return accountService.getAllUser();
    }

    @PostMapping("/create")
    public ResponseEntity<AccountDto> createAccount(@RequestBody AccountDto accountDto) {

        ResponseEntity<AccountDto> response = null;

        return new ResponseEntity<>(accountService.createAccount(accountDto),HttpStatus.CREATED);
    }

}
