package com.proxym.ordermanagement.entity;
import javax.persistence.Embeddable;


@Embeddable
//A number of monetary units specified using a given unit of currency."
public class AmountType {

    private Double  amountContent;
    private String  amountCurrencyIdentifier;
    private String amountCurrencyCodeListVersionIdentifier;
}
