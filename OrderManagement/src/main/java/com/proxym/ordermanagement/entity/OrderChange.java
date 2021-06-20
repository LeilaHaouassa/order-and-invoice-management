package com.proxym.ordermanagement.entity;


import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;
@Entity
public class OrderChange {

    //Required
    //"The date, assigned by the sender, on which this document was issued.",
    private DateType issueDate ;

    //"The time, assigned by the sender, at which this document was issued."
    private  TimeType issueTime ;

    //Required
    //"The Order Change Sequence Number assigned by the Buyer to ensure the
    // proper sequencing of changes."
    @EmbeddedId
    private IdentifierType sequenceNumberID;

    //"Free-form text pertinent to this document, conveying
    // information that is not contained explicitly in other structures."
    @Size(min =1)
    @ElementCollection
    private Set<TextType> note = new HashSet<>();

    //"A code signifying the currency requested for amount totals in
    // Invoices related to this Order Change.
    @Embedded
    private CodeType requestedInvoiceCurrencyCode;

    //"A code signifying the default currency for this document."
    @Embedded
    private CodeType documentCurrencyCode;

    //"The buyer's accounting cost centre, applied to the Order Change
    // as a whole, expressed as text."
    @Embedded
    private TextType accountingCost;

    //"The period for which the Order  Change is valid."
    @Size(min =1)
    @ElementCollection
    private Set<Period> validityPeriod = new HashSet<>();

    //Required
    //"A reference to the Order being changed.
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

    //"The total amount of a specific type of tax."
    @Size(min =1)
    @ElementCollection
    private Set<TaxTotal> taxTotal = new HashSet<>();

    //Required
    //"A line associated with a line in the Catalogue and specifying a kind of
    // item being ordered."
    @Size(min =1)
    @ElementCollection
    private Set<OrderLine> orderLine = new HashSet<>();

}
