package com.example.jpainheritance.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "BM_TYPE")
@NoArgsConstructor
@Getter
@Setter
@ToString
public abstract class BillingMethod {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    @Column(name="BM_TYPE", insertable = false, updatable = false)
    protected String bmType;

    @NotNull
    @Column(nullable = false)
    private String owner;

    protected BillingMethod(String owner) {
        this.owner = owner;
    }
}
