package com.proxym.ordermanagement.entity;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.List;

//"A class to define an identifier for a party."
@Embeddable
public class PartyIdentification implements Serializable {

    //"An identifier for the party."
    @Embedded
    private IdentifierType id ;
}
