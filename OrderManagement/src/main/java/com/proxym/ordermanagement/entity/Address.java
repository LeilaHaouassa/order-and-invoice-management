package com.proxym.ordermanagement.entity;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.Set;

@Entity
//"A class to define common information related to an address."
public class Address {
    @EmbeddedId
    //"An identifier for this address within an agreed
    // scheme of address identifiers."
    private IdentifierType id;



    //"A post office box number registered for postal
    // delivery by a postal service provider."
    @Embedded
    private TextType postbox;


    //"The name of the street, road, avenue, way, etc.
    // to which the number of the building is attached."
    @Embedded
    private TextType streetName;

    //"The name of a building."
    @Embedded
    private TextType buildingName;

    //"The number of a building within the street."
    @Embedded
    private TextType buildingNumber;

    //"The name of a city, town, or village."
    @Embedded
    private TextType  cityName;

    //"The postal identifier for this address according to the
    // relevant national postal service, such as a ZIP code or Post Code."
    @Embedded
    private TextType  postalZone;

    //"The recognized geographic or economic region or group of
    // countries in which this address is located."
    @Embedded
    private TextType region;

    //"An unstructured address line."
    @Size(min=1)
    @ElementCollection
    private Set<AddressLine> addressLine = new HashSet<>() ;

    //"The country in which this address is situated."
    @Embedded
    private Country  country;

    public Address() {
    }
}
