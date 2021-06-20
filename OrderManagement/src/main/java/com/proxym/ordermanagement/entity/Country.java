package com.proxym.ordermanagement.entity;

import javax.persistence.Embeddable;



//"A class to describe a country."
@Embeddable
public class Country {

    private CodeType identificationCode;

    private TextType name;
}
