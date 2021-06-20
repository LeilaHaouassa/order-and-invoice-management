package com.proxym.ordermanagement.entity;

import javax.persistence.Embeddable;

//"A numeric value determined
// by measuring an object using a specified unit of measure."
@Embeddable
public class MeasureType {

    //Required
    private Long measureContent;
    //Required
    private String measureUnitCode;
    private String measureUnitCodeListVersionIdentifier;
}
