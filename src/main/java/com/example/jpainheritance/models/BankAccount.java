package com.example.jpainheritance.models;

import lombok.*;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
@DiscriminatorValue("BA")
@Getter
@Setter
@ToString
public class BankAccount extends BillingMethod {

    @NotNull
    protected BankAccountInfo bankAccountInfo;

    public BankAccount() {
        super();
    }

    public BankAccount(String owner, String accountNumber) {
        super(owner);
        this.bankAccountInfo = new BankAccountInfo(accountNumber);
    }

    @Embeddable
    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    @Setter
    @ToString
    public static class BankAccountInfo {
        @NotNull
        protected String accountNumber;
    }
}
