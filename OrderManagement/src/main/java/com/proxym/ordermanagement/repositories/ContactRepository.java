package com.proxym.ordermanagement.repositories;

import com.proxym.ordermanagement.entity.Contact;
import com.proxym.ordermanagement.entity.IdentifierType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, IdentifierType> {
}
