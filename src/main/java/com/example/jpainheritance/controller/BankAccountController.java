package com.example.jpainheritance.controller;

import com.example.jpainheritance.models.BankAccount;
import com.example.jpainheritance.service.BankAccountService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/bankaccounts")
public class BankAccountController {

    private final BankAccountService bankAccountService;

    @GetMapping("")
    List<BankAccount> getBankAccounts() {
        return bankAccountService.getBankAccounts();
    }
}
