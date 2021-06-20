package com.proxym.ordermanagement.entity;


import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

//"A class to describe an organization, sub-organization,
// or individual fulfilling a role in a business process."
@Entity
public class Party {

    //"An identifier for this party."
    //Originally a Party has a list of PartyIdentification
    @EmbeddedId
    private PartyIdentification partyIdentification;

    //"A name for this party."
    @Size(min=1)
    @ElementCollection
    private Set<PartyName> partyName = new HashSet<>();

    //"The party's postal address."
    @OneToOne(fetch = FetchType.LAZY)
    private Address postalAddress ;

    //"The primary contact for this party."
    @OneToOne(fetch = FetchType.LAZY)
    private Contact  contact;

    //"The financial account associated with this party."
    @OneToOne(fetch = FetchType.LAZY)
    private FinancialAccount financialAccount ;




}

