package com.proxym.ordermanagement.repositories;

import com.proxym.ordermanagement.entity.IdentifierType;
import com.proxym.ordermanagement.entity.OrderReference;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderReferenceRepository extends JpaRepository<OrderReference, IdentifierType> {
}
