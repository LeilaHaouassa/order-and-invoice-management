package com.proxym.ordermanagement.entity;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

//"A class to describe a line item."
@Entity
public class LineItem {
    //Required
    //"An identifier for this line item, assigned by the buyer."
    @EmbeddedId
    private IdentifierType id;

    //Free-form text conveying information that is not contained
    // explicitly in other structures."
    @Size(min=1)
    @ElementCollection
    private Set<TextType> note = new HashSet<>();

    //"The quantity of items associated with this line item."
    @Embedded
    private QuantityType quantity;

    //"The price of the item of trade associated with this line item."
    @Embedded
    private Price price;

    //Required
    @Embedded
    private Item item;
}
