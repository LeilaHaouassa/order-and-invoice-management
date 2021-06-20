package com.proxym.ordermanagement.entity;


import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;

//Having three Ids buzzles me too

//"A class to describe a customer party."
@Entity
public class CustomerParty {
    //An identifier for the customer's account, assigned
    // by the customer itself."
    @EmbeddedId
    private IdentifierType customerAssignedAccountID;
    //An identifier for the customer's account, assigned by the supplier."
    @EmbeddedId
    private IdentifierType supplierAssignedAccountID;
    //An identifier for the customer's account, assigned by a third party."
    @EmbeddedId
    private IdentifierType  additionalAccountID;


    //"The customer party itself."
    @OneToOne(fetch = FetchType.EAGER)
    private Party party;

    //"A customer contact for deliveries."
    @OneToOne(fetch = FetchType.LAZY)
    private Contact deliveryContact;

    //"A customer contact for  accounting."
    @OneToOne(fetch = FetchType.LAZY)
    private Contact accountingContact;

    //"A customer contact for purchasing."
    @OneToOne(fetch = FetchType.LAZY)
    private Contact buyerContact;






}
