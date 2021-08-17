package com.example.jpainheritance.repository;

import com.example.jpainheritance.models.BillingMethod;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BillingMethodRepository extends JpaRepository<BillingMethod, Long> {
}
