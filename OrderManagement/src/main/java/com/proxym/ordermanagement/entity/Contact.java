package com.proxym.ordermanagement.entity;

//A class to describe a contactable person or
// department in an organization."

import javax.persistence.*;
import javax.validation.constraints.Size;

import java.util.HashSet;
import java.util.Set;


@Entity
public class Contact {

    @EmbeddedId
    private IdentifierType iD;

    @Embedded
    private TextType name;

    @Embedded
    private TextType telephone;

    @Embedded
    private TextType telefax;

    @Embedded
    private TextType electronicMail;

    //Free-form text conveying information that is not contained
    // explicitly in other structures; in particular, a textual
    // description of the circumstances under which this
    // contact can be used (e.g., \"emergency\" or \"after hours\")."
    @Size(min=1)
    @ElementCollection
    private Set<TextType> note = new HashSet<>();

}
