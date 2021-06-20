package com.proxym.ordermanagement.entity;

import javax.persistence.Embeddable;

//"A class to describe a price, expressed in a data structure
// containing multiple properties (compare with UnstructuredPrice)."
@Embeddable
public class Price {

    //Required
    private AmountType priceAmount;
}
