package com.cbg.rental.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.cbg.rental.entities.Owner;

@RepositoryRestResource(path = "own")
@CrossOrigin(origins = "http://localhost:4200/")
public interface OwnerRepository extends JpaRepository<Owner, Long> {

}
 