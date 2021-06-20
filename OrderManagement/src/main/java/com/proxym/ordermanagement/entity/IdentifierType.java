package com.proxym.ordermanagement.entity;

import javax.persistence.Embeddable;
import java.io.Serializable;

//"A character string to identify and distinguish uniquely, one instance of
// an object in an identification scheme from all other objects in the same
// scheme together with relevant supplementary information."
@Embeddable
public class IdentifierType implements Serializable {

    private String identifierContent;
    private String identificationSchemeIdentifier;
    private String identificationSchemeNameText;
    private String identificationSchemeAgencyIdentifier;
    private String identificationSchemeAgencyNameText;
    private String identificationSchemeVersionIdentifier;
    private String identificationSchemeDataUniformResourceIdentifier;
    private String identificationSchemeUniformResourceIdentifier;



    public IdentifierType() {
    }

    public IdentifierType(String identifierContent) {
        this.identifierContent = identifierContent;
    }

    public String getIdentifierContent() {
        return identifierContent;
    }

    public void setIdentifierContent(String identifierContent) {
        this.identifierContent = identifierContent;
    }
}
