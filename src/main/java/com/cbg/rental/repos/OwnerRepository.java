package com.cbg.rental.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cbg.rental.entities.Owner;

public interface OwnerRepository extends JpaRepository<Owner, Long> {

}
 