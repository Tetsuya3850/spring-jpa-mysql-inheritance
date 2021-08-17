package com.example.jpainheritance.controller;

import com.example.jpainheritance.models.BillingMethod;
import com.example.jpainheritance.service.BillingMethodService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/billingmethods")
public class BillingMethodController {

    private final BillingMethodService billingMethodService;

    @GetMapping("")
    List<BillingMethod> getBillingMethods() {
        return billingMethodService.getBillingMethods();
    }
}
