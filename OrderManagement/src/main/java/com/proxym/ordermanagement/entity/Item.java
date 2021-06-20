package com.proxym.ordermanagement.entity;

import javax.persistence.Embeddable;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

//"A class to describe an item of trade. It includes a generic
// description applicable to all examples of the item together
// with optional subsidiary descriptions of any number of
// actual instances of the type."
@Embeddable
public class Item {

    //"Text describing this item.",
    @Size(min=1)
    private Set<TextType> description = new HashSet<>();

    //"A short name optionally given to this item, such as a
    // name from a catalogue, as distinct from a description."
    private  TextType name;

    //"The country of origin of this item.",
    private Country  originCountry;
}
