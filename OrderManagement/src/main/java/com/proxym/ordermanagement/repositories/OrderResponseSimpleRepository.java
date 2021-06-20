package com.proxym.ordermanagement.repositories;

import com.proxym.ordermanagement.entity.IdentifierType;
import com.proxym.ordermanagement.entity.OrderResponseSimple;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderResponseSimpleRepository extends JpaRepository<OrderResponseSimple, IdentifierType> {
}
