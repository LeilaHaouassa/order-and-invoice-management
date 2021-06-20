package com.proxym.ordermanagement.entity;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Embeddable
//"A character string (i.e. a finite set
// of characters) generally in the form of words of a language."
public class TextType {

    private String textContent;
    private String languageIdentifier;
    private String languageLocaleIdentifier;


    public TextType() {
    }

    public String getTextContent() {
        return textContent;
    }

    public void setTextContent(String textContent) {
        this.textContent = textContent;
    }
}
