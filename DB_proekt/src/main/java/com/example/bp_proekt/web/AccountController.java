package com.example.bp_proekt.web;

import com.example.bp_proekt.model.Account;
import com.example.bp_proekt.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/account")
public class AccountController {
    final
    AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }


    @PostMapping("/create")
    public ResponseEntity<Account> createAccount(@RequestBody Account newUser) {
        Account acc=accountService.create(newUser);
        if(Optional.ofNullable(acc).isPresent())
            return new ResponseEntity<>(acc, HttpStatus.OK);
        else
            return new ResponseEntity<>(new Account(), HttpStatus.INTERNAL_SERVER_ERROR);


    }
}
