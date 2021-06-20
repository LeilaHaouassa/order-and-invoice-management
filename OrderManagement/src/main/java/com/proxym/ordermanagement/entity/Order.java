package com.proxym.ordermanagement.entity;

import javax.persistence.*;
import javax.validation.constraints.Size;

import java.util.HashSet;
import java.util.Set;
@Entity
//"A document used to order goods and services."
public class Order {
    //"An identifier for this document, assigned by the sender."
    @EmbeddedId
    private IdentifierType id;

    //Required
    //"The date, assigned by the sender, on which this document was issued.",
    private  DateType issueDate ;

    //"The time, assigned by the sender, at which this document was issued."
    private  TimeType issueTime ;


    //"Free-form text pertinent to this document, conveying
    // information that is not contained explicitly in other structures."
    @Size(min =1)
    @ElementCollection
    private Set<TextType> note = new HashSet<>();


    //"A code signifying the currency requested for amount totals in
    // Invoices related to this Order."
    private CodeType requestedInvoiceCurrencyCode;


    //"A code signifying the default currency for this document."
    private CodeType documentCurrencyCode;


    //"The buyer's accounting cost centre, applied to the Order as a whole, expressed as text."
    private TextType accountingCost;


    //"The period for which the Order is valid."
    @Size(min =1)
    @ElementCollection
    private Set<Period> validityPeriod = new HashSet<>();


    //"The buyer."  //Required
    @OneToOne(fetch = FetchType.EAGER)
    private CustomerParty buyerCustomerParty;

    //"The seller."  //Required
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
