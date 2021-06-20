package com.proxym.ordermanagement.repositories;

import com.proxym.ordermanagement.entity.IdentifierType;
import com.proxym.ordermanagement.entity.OrderChange;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderChangeRepository extends JpaRepository<OrderChange, IdentifierType> {
}
