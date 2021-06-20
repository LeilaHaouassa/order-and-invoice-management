package com.proxym.ordermanagement.entity;

import javax.persistence.*;

import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

//"A document used to cancel an entire Order."
@Entity
public class OrderCancellation {
    //Required
    @EmbeddedId
    private IdentifierType id;

    //Required
    //"The date, assigned by the sender, on which this document was issued."
    @Embedded
    private  DateType issueDate ;


    //"The time, assigned by the sender, at which this document was issued."
    @Embedded
    private  TimeType issueTime ;


    //"Free-form text pertinent to this document, conveying
    // information that is not contained explicitly in other structures."
    @Size(min =1)
    @ElementCollection
    private Set<TextType> note = new HashSet<>();


    //Required
    //"The general reason for cancellation of the referenced order."
    @Size(min =1)
    @ElementCollection
    private Set<TextType> cancellationNote = new HashSet<>();

    //Required
    //"A reference to the Order being cancelled. While multiple
    // references are allowed, it is considered better practice to
    // cancel only one Order in each Order Cancellation document."
    @Size(min =1)
    @OneToMany
    private Set<OrderReference> orderReference = new HashSet<>();

    //Required
    //"The buyer."
    @OneToOne(fetch = FetchType.EAGER)
    private CustomerParty buyerCustomerParty;

    //Required
    //"The seller."
    @OneToOne(fetch = FetchType.EAGER)
    private SupplierParty sellerSupplierParty;

}
