package com.proxym.ordermanagement.repositories;

import com.proxym.ordermanagement.entity.IdentifierType;
import com.proxym.ordermanagement.entity.LineItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LineItemRepository extends JpaRepository<LineItem, IdentifierType> {
}
