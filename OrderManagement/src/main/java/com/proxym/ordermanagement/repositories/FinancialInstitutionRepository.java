package com.proxym.ordermanagement.repositories;

import com.proxym.ordermanagement.entity.FinancialInstitution;
import com.proxym.ordermanagement.entity.IdentifierType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FinancialInstitutionRepository extends JpaRepository<FinancialInstitution, IdentifierType> {
}
