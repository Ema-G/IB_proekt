package com.example.bp_proekt.service.impl;

import com.example.bp_proekt.model.Account;
import com.example.bp_proekt.repository.AccountRepository;
import com.example.bp_proekt.service.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {
    final
    AccountRepository accountRepository;

    public AuthServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public Account login(String username, String password){
        System.out.println("username="+ username + ", password=" + password );
        return accountRepository.findByUsernameAndPassword(username,password);
    }
}
