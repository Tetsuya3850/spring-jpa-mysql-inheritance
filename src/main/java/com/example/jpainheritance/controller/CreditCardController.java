package com.example.jpainheritance.controller;

import com.example.jpainheritance.models.CreditCard;
import com.example.jpainheritance.service.CreditCardService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/creditcards")
public class CreditCardController {

    private final CreditCardService creditCardService;

    @GetMapping("")
    List<CreditCard> getCreditCards() {
        return creditCardService.getCreditCards();
    }
}
