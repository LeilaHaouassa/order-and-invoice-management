package com.proxym.ordermanagement.entity;

import javax.persistence.*;

//"A class to describe a financial institution."
@Entity
public class FinancialInstitution {

    //An identifier for this financial institution. It is recommended
    //that the ISO 9362 Bank Identification Code (BIC) be used as the ID."

    @EmbeddedId
    private IdentifierType iD;

    //"The name of this financial institution."
    @Embedded
    private TextType name;


    //"The address of this financial institution."
    @OneToOne(fetch = FetchType.LAZY)
    private Address address;


}
