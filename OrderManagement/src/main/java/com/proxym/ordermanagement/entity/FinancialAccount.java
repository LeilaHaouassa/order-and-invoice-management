package com.proxym.ordermanagement.entity;

import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.OneToOne;


//"A class to describe a financial account."
@Entity
public class FinancialAccount {

    //"The identifier for this financial account; the bank account number."
    @EmbeddedId
    private IdentifierType id;

    //"The name of this financial account."
    @Embedded
    private TextType name;

    //An alias for the name of this financial account, to be
    // used in place of the actual account name for security reasons."
    @Embedded
    private TextType aliasName ;

    //"A code signifying the currency in which this financial account is held."
    @Embedded
    private CodeType  currencyCode;

    //Free-form text applying to the Payment for the owner of this account."
    @Embedded
    private TextType paymentNote;

    //"The branch of the financial institution associated with this financial account."
    @OneToOne
    private Branch financialInstitutionBranch;

    //"The country in which the holder of the financial account is domiciled."
    @Embedded
    private Country country;

}
