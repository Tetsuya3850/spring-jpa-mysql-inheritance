package com.example.jpainheritance.service;

import com.example.jpainheritance.models.BankAccount;
import com.example.jpainheritance.repository.BankAccountRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BankAccountService {

    private final BankAccountRepository bankAccountRepository;

    public List<BankAccount> getBankAccounts() {
        return bankAccountRepository.findAll();
    }
}
