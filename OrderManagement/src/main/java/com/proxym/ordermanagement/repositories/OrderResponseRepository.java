package com.proxym.ordermanagement.repositories;

import com.proxym.ordermanagement.entity.IdentifierType;
import com.proxym.ordermanagement.entity.OrderResponse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderResponseRepository extends JpaRepository<OrderResponse, IdentifierType> {
}
