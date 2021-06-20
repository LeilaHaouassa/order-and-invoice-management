package com.proxym.ordermanagement.repositories;


import com.proxym.ordermanagement.entity.Branch;
import com.proxym.ordermanagement.entity.IdentifierType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BranchRepository extends JpaRepository<Branch, IdentifierType> {
}
