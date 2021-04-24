package com.excel.moneytrasferapiactpasd.controllers;

import com.excel.moneytrasferapiactpasd.domains.Account;
import com.excel.moneytrasferapiactpasd.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping(value = "/create", produces = "application/json")
    public Account createAccount(@RequestBody Account accountRequest){

        return accountService.createAccount(accountRequest);
    }

}
