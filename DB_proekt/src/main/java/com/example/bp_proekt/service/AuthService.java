package com.example.bp_proekt.service;

import com.example.bp_proekt.model.Account;

public interface AuthService {
    Account login(String username, String password);
}
