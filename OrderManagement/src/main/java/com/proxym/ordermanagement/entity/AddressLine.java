package com.proxym.ordermanagement.entity;
import javax.persistence.*;

@Embeddable
//"A class to define an unstructured address line."
public class AddressLine {

    @Embedded
    //"An address line expressed as unstructured text."
    private TextType line;
}
