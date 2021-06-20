package com.proxym.ordermanagement.entity;

import javax.persistence.Embeddable;

//"A counted number of non-monetary units possibly including fractions."
@Embeddable
public class QuantityType {

    private Double quantityContent;

    private String qantityUnitCode;
}
