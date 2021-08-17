package com.example.jpainheritance.service;

import com.example.jpainheritance.models.CreditCard;
import com.example.jpainheritance.repository.CreditCardRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CreditCardService {

    private final CreditCardRepository creditCardRepository;

    public List<CreditCard> getCreditCards() {
        return creditCardRepository.findAll();
    }
}
