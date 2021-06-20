package com.proxym.ordermanagement.entity;


import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

//A document used to indicate simple
// acceptance or rejection of an entire Order."
@Entity
public class OrderResponseSimple {
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

    //"Indicates whether the Order is accepted (true) or rejected (false)."
    @Embedded
    private IndicatorType acceptedIndicator;

    //"The reason for rejection if the order was not accepted."
    @Size(min =1)
    @ElementCollection
    private Set<TextType> rejectionNote = new HashSet<>();

    //"A code signifying the currency requested for amount totals in
    // Invoices related to this Order."
    @Embedded
    private CodeType requestedInvoiceCurrencyCode;

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

    //"The buyer."
    @OneToOne(fetch = FetchType.EAGER)
    private CustomerParty buyerCustomerParty;

    //"The seller."
    @OneToOne(fetch = FetchType.EAGER)
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
