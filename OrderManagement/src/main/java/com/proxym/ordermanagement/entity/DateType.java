package com.proxym.ordermanagement.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Embeddable;
import javax.validation.constraints.Pattern;
//"One calendar day according the Gregorian calendar."
@Embeddable
public class DateType {
    @Pattern(regexp="^-*[^T:-]+-[^T:]+$")
    @DateTimeFormat
    private String dateContent;


}
