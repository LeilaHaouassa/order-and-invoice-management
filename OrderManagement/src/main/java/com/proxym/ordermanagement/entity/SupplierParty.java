package com.proxym.ordermanagement.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;


//"A class to describe a supplier party."
@Entity
public class SupplierParty {

    //"An identifier for this supplier party, assigned by the customer."
    @EmbeddedId
    private IdentifierType customerAssignedAccountID;

    //"The supplier party itself."
    @OneToOne(fetch = FetchType.EAGER)
    private Party party;

    //"A contact at this supplier party for despatches (pickups)."
    //despatch might look like a typo but cant change it bcz of the schema
    @OneToOne(fetch = FetchType.LAZY)
    private Contact despatchContact;

    //"A contact at this supplier party for accounting."
    @OneToOne(fetch = FetchType.LAZY)
    private Contact accountingContact;

    //"The primary contact for this supplier party."
    @OneToOne(fetch = FetchType.LAZY)
    private Contact sellerContact;


}
