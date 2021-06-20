package com.proxym.ordermanagement.entity;


import javax.persistence.*;

@Entity
//"A class to describe a branch or a division of an organization."
public class Branch {

    //"An identifier for this branch or division of an organization."
    @EmbeddedId
    private IdentifierType id;

    //"The name of this branch or division of an organization."
    @Embedded
    private TextType name;

    //"The name of this branch or division of an organization."
    @OneToOne
    private FinancialInstitution financialInstitution;

    //"The address of this branch or division."
    @OneToOne(fetch = FetchType.LAZY)
    private Address address;




}
