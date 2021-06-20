package com.proxym.ordermanagement.entity;

import javax.persistence.Embeddable;
import javax.persistence.Embedded;

import java.util.List;

//"The name of the party."
@Embeddable
public class PartyName {
    @Embedded
    private TextType  name;
}
