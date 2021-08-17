package com.example.jpainheritance.models;

import lombok.*;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
@DiscriminatorValue("CC")
@Getter
@Setter
@ToString
public class CreditCard extends BillingMethod {

    @NotNull
    protected CreditCardInfo creditCardInfo;

    public CreditCard() {
        super();
    }

    public CreditCard(String owner, String cardNumber) {
        super(owner);
        this.creditCardInfo = new CreditCardInfo(cardNumber);
    }

    @Embeddable
    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    @Setter
    @ToString
    public static class CreditCardInfo {
        @NotNull
        protected String cardNumber;
    }
}
