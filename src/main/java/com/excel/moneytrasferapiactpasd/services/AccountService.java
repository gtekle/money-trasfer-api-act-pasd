package com.excel.moneytrasferapiactpasd.services;

import com.excel.moneytrasferapiactpasd.domains.Account;
import com.excel.moneytrasferapiactpasd.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public Account createAccount(Account account){
        return accountRepository.save(account);
    }

    public Iterable<Account> getAllAccounts(){
        return accountRepository.findAll();
    }

    public Account getAccountById(String id){

//        Converting String to Long
        Long uselessVariable = 23L;
        Long idLong = Long.valueOf(id);

        Optional<Account> accountById = accountRepository.findById(idLong);

        return accountById.orElse(null);
    }
}
