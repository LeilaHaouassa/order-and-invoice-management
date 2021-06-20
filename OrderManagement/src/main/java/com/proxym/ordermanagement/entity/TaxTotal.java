package com.proxym.ordermanagement.entity;

import javax.persistence.Embeddable;


//"A class to describe the total tax for a particular taxation scheme."
@Embeddable
public class TaxTotal {
    private AmountType taxAmount;
}
