package com.proxym.ordermanagement.entity;

import javax.persistence.Embeddable;

// "A character string (letters, figures, or symbols) that for brevity
// and/or language independence may be used to represent or replace
// a definitive value or text of an attribute together with relevant
// supplementary information."
@Embeddable
public class CodeType {
    //Required
    private String codeContent;
    private String codeListIdentifier;
    private String codeListAgencyIdentifier;
    private String codeListAgencyNameText;
    private String codeListNameText;
    private String codeListVersionIdentifier;
    private String codeNameText;
    private String languageIdentifier;
    private String codeListUniformResourceIdentifier;
    private String codeListSchemeUniformResourceIdentifier;


    public CodeType() {

    }

    public String getCodeContent() {
        return codeContent;
    }

    public void setCodeContent(String codeContent) {
        this.codeContent = codeContent;
    }
}
