package com.proxym.ordermanagement.repositories;

import com.proxym.ordermanagement.entity.IdentifierType;
import com.proxym.ordermanagement.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, IdentifierType> {
}
