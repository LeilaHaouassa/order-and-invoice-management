package com.proxym.ordermanagement.repositories;

import com.proxym.ordermanagement.entity.IdentifierType;
import com.proxym.ordermanagement.entity.OrderCancellation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderCancellationRepository extends JpaRepository<OrderCancellation, IdentifierType> {
}
