package com.example.bp_proekt.service.impl;

import com.example.bp_proekt.model.Account;
import com.example.bp_proekt.repository.AccountRepository;
import com.example.bp_proekt.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServicImpl implements AccountService {

    final
    AccountRepository accRepo;

    public AccountServicImpl(AccountRepository accRepo) {
        this.accRepo = accRepo;
    }

    public Account create(Account newUser) {
        Account acc=new Account();
        acc.setIdAccount(newUser.getIdAccount());
        acc.setUsername(newUser.getUsername());
        acc.setName(newUser.getName());
        acc.setSurname(newUser.getSurname());
        acc.setAddress(newUser.getAddress());
        acc.setEmail(newUser.getEmail());
        acc.setPassword(newUser.getPassword());
        accRepo.save(acc);
        return acc;
    }
}
