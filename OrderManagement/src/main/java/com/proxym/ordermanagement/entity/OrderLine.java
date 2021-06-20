package com.proxym.ordermanagement.entity;

import javax.persistence.ElementCollection;
import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

//"A class to define a line in an order document (e.g., Order,
// Order Change, or Order Response) describing an item being ordered."
@Embeddable
public class OrderLine {

    //Free-form text conveying information that is not contained
    // explicitly in other structures."
    @Size(min=1)
    @ElementCollection
    private Set<TextType> note = new HashSet<>();

    //"The line item itself."
    @OneToOne(fetch = FetchType.LAZY)
    private LineItem lineItem;
}
