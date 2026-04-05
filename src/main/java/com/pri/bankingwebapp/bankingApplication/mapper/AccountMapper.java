package com.pri.bankingwebapp.bankingApplication.mapper;

import com.pri.bankingwebapp.bankingApplication.dto.AccountDto;
import com.pri.bankingwebapp.bankingApplication.entity.Account;
import com.pri.bankingwebapp.bankingApplication.repository.AccountRepository;
import org.apache.catalina.mapper.Mapper;

public class AccountMapper{
    public static Account mapToAccount(AccountDto accountdto) {
        Account account = new Account(
                accountdto.getId(),
                accountdto.getAccountHolderName(),
                accountdto.getBalance()
        );
        return account;

    }
    public static AccountDto mapToAccountDto(Account account) {
        AccountDto accountDto = new AccountDto(
                account.getId(),
                account.getAccountHolderName(),
                account.getBalance()
        );
        return accountDto;
    }

}
