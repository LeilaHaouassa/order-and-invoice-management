package com.proxym.ordermanagement.entity;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;


//what is weird for me here that the reference holds no id of the referenced
//order, it just holds the exact time and notes
//further investigation is needed !!!


//"A class to define a reference to an Order."
@Entity
public class OrderReference {

    //Required
    //"An identifier for this order reference, assigned by the buyer."
    @EmbeddedId
    private IdentifierType id;

    //"The date on which the referenced Order was issued."
    @Embedded
    private DateType issueDate ;

    //"The time at which the referenced Order was issued."
    @Embedded
    private  TimeType issueTime ;
}
