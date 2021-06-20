package com.proxym.ordermanagement.repositories;

import com.proxym.ordermanagement.entity.Party;
import com.proxym.ordermanagement.entity.PartyIdentification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartyRepository extends JpaRepository<Party, PartyIdentification> {
}
