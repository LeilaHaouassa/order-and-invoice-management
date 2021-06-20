package com.proxym.ordermanagement.entity;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

//"A document used to indicate detailed acceptance
// or rejection of an Order or to make a counter-offer."
@Entity
public class OrderResponse {
    //Required
    @EmbeddedId
    private IdentifierType id;

    //Required
    //"The date, assigned by the sender, on which this document was issued.",
    @Embedded
    private DateType issueDate ;

    //"The time, assigned by the sender, at which this document was issued."
    @Embedded
    private  TimeType issueTime ;

    //"Free-form text pertinent to this document, conveying
    // information that is not contained explicitly in other structures."
    @Size(min =1)
    @ElementCollection
    private Set<TextType> note = new HashSet<>();

    //"A code signifying the default currency for this document."
    @Embedded
    private CodeType documentCurrencyCode;


    //"The buyer's accounting cost centre, applied to the Order as a whole, expressed as text."
    @Embedded
    private TextType accountingCost;


    //"The period for which the Order is valid."
    @Size(min =1)
    @ElementCollection
    private Set<Period> validityPeriod = new HashSet<>();

    //Required
    //"A reference to the Order being responded to.
    @Size(min =1)
    @OneToMany
    private Set<OrderReference> orderReference = new HashSet<>();

    //Required
    //"The buyer."
    @OneToOne(fetch = FetchType.EAGER)
    private CustomerParty buyerCustomerParty;

    //Required
    //"The seller."
    @OneToOne(fetch = FetchType.LAZY)
    private SupplierParty sellerSupplierParty;

    //"The total amount of a specific type of tax."
    @Size(min =1)
    @ElementCollection
    private Set<TaxTotal> taxTotal = new HashSet<>();

    //"A line associated with a line in the Catalogue and specifying a kind of
    // item being ordered."
    @Size(min =1)
    @ElementCollection
    private Set<OrderLine> orderLine = new HashSet<>();

}
