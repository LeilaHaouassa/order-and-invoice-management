package com.proxym.ordermanagement.repositories;

import com.proxym.ordermanagement.entity.CustomerParty;
import com.proxym.ordermanagement.entity.IdentifierType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerPartyRepository extends JpaRepository<CustomerParty, IdentifierType> {
}
