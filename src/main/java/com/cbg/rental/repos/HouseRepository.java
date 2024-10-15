package com.cbg.rental.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.cbg.rental.entities.House;
import com.cbg.rental.entities.Owner;

@RepositoryRestResource(path = "houses")
public interface HouseRepository extends JpaRepository<House, Long> {
	List<House> findByAddress (String address);
	List<House> findByAddressContains (String address);
	List<House> findByRentPriceLessThanEqual(double rentPrice);
	List<House> findByStatus(String status);
	
	List<House> findByOwner(Owner owner);
	List<House> findByOwnerIdOwner(Long id);
	List<House> findByOrderByRentPriceAsc();
	
}
