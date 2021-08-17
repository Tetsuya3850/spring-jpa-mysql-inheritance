package com.example.jpainheritance.service;

import com.example.jpainheritance.models.BillingMethod;
import com.example.jpainheritance.repository.BillingMethodRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BillingMethodService {

    private final BillingMethodRepository billingMethodRepository;

    public List<BillingMethod> getBillingMethods() {
        return billingMethodRepository.findAll();
    }
}
