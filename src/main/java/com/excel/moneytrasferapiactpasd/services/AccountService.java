package com.excel.moneytrasferapiactpasd.services;

import com.excel.moneytrasferapiactpasd.domains.Account;
import com.excel.moneytrasferapiactpasd.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public Account createAccount(Account account){
        return accountRepository.save(account);
    }
}
