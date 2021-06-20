package com.proxym.ordermanagement.repositories;

import com.proxym.ordermanagement.entity.FinancialAccount;
import com.proxym.ordermanagement.entity.IdentifierType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FinancialAccountRepository extends JpaRepository<FinancialAccount, IdentifierType> {
}
