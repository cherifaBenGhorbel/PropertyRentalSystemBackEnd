package com.cbg.rental.service;

import java.util.List;

import com.cbg.rental.entities.House;
import com.cbg.rental.entities.Owner;

public interface HouseService {

	House saveHouse(House h);
	House updateHouse(House h);
	void deleteHouse(House h);
	void deleteHouseById(Long id);
	House getHouse(Long id);
	List<House> getAllHouses();
	
	List<House> findByAddress (String address);
	List<House> findByAddressContains (String address);
	List<House> findByRentPriceLessThanEqual(double rentPrice);
	List<House> findByStatus(String status);
	
	List<House> findByOwner(Owner owner);
	List<House> findByOwnerIdOwner(Long id);
	List<House> findByOrderByRentPriceAsc();

}