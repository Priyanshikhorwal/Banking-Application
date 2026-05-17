package com.pri.bankingwebapp.bankingApplication.controller;

import com.pri.bankingwebapp.bankingApplication.dto.AccountDto;
import com.pri.bankingwebapp.bankingApplication.entity.Account;
import com.pri.bankingwebapp.bankingApplication.mapper.AccountMapper;
import com.pri.bankingwebapp.bankingApplication.service.AccountService;
import jakarta.servlet.http.HttpServletRequest;
import org.hibernate.sql.Update;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.web.csrf.CsrfToken;
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
    public Page<AccountDto> getAccountAll(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size) {

        return accountService.getAllUser(page, size);
    }
    @GetMapping("/csrf-token")
    public CsrfToken getToken(HttpServletRequest request){
        return (CsrfToken)request.getAttribute("_csrf");
    }

    @PostMapping("/create")
    public ResponseEntity<AccountDto> createAccount(@PathVariable Long customerId,@RequestBody AccountDto accountDto) {

        return new ResponseEntity<>(accountService.createAccount(customerId,accountDto),HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    public ResponseEntity<AccountDto> updateUserById(@PathVariable Long id, @RequestBody AccountDto accountDto) {
        return new ResponseEntity<>(accountService.updateById(id,accountDto) ,HttpStatus.RESET_CONTENT);
    }

}
