package com.proxym.ordermanagement.repositories;

import com.proxym.ordermanagement.entity.IdentifierType;
import com.proxym.ordermanagement.entity.SupplierParty;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierPartyRepository extends JpaRepository<SupplierParty, IdentifierType> {
}
