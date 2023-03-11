package sk.fmfi.fatrabank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sk.fmfi.fatrabank.domain.Account;
import sk.fmfi.fatrabank.domain.User;
import sk.fmfi.fatrabank.service.AccountService;

@RestController
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping(value = "/richest")
    public Account getAllUsers() {
        return accountService.richest();
    }
}
