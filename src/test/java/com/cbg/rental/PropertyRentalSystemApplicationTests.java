package com.cbg.rental;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cbg.rental.entities.House;
import com.cbg.rental.entities.Owner;
import com.cbg.rental.repos.HouseRepository;
import com.cbg.rental.repos.OwnerRepository;

@SpringBootTest
class PropertyRentalSystemApplicationTests {

	@Autowired
	private OwnerRepository ownerRepository;
	
	@Autowired
	private HouseRepository houseRepository;
	
/*	
	@Test
	public void testCreateHouse() {
		House house = new House(null, "Nabeul", 850, "Rented", null);
		houseRepository.save(house);
	}
	
	@Test
	public void testFindHouseByAddress() {
		List<House> hows = houseRepository.findByAddress("Nabeul");
		for (House h : hows) {
			System.out.println(h);
		}
	}
	
	@Test
	public void testFindHouseByAddressContains() {
		List<House> hows = houseRepository.findByAddressContains("e");
		for (House h : hows) {
			System.out.println(h);
		}
	}
	
	@Test
	public void testFindHouseByRentPriceLessThanEqual() {
		List<House> hows = houseRepository.findByRentPriceLessThanEqual(900);
		for (House h : hows) {
			System.out.println(h);
		}
	}
	
	@Test
	public void testFindByOwner() {
	    Owner ahm = ownerRepository.findById(4L).orElse(null);
	    if (ahm != null) {
	        List<House> houses = houseRepository.findByOwner(ahm);
	        for (House h : houses) {
	            System.out.println(h);
	        }
	    } else {
	        System.out.println("Owner with ID 4 not found.");
	    }
	}

	@Test
	public void testFindByOwnerId() {
	    Long ownerId = 4L;
	    List<House> houses = houseRepository.findByOwnerIdOwner(ownerId);
	    
	    if (!houses.isEmpty()) {
	        for (House h : houses) {
	            System.out.println(h);
	        }
	    } else {
	        System.out.println("No houses found for Owner with ID: " + ownerId);
	    }
	}
	
	@Test
	public void testFindByOoderByRentPriceAsc() {
	    List<House> houses = houseRepository.findByOrderByRentPriceAsc();
	        for (House h : houses) {
	            System.out.println(h);
	        }

	}


	

	@Test
	public void testCreateOwner() {
		Owner owner = new Owner("Ahmed", "257898762", "ahmed@gmail.com", null);
		ownerRepository.save(owner);
	}
	
	@Test
	public void testFindOwner()
	{
		Owner o = ownerRepository.findById(4L).get();
		System.out.println(o);
	}

	@Test
	public void testUpdateOwner() {
		Owner o = ownerRepository.findById(3L).get();
		o.setName("Nadia");
		ownerRepository.save(o);
	}

	@Test
	public void testDeleteOwner() {
		ownerRepository.deleteById(2L);
	}

	@Test
	public void testShowAllOwners() {
		List<Owner> owner = ownerRepository.findAll();
		for (Owner o : owner) {
			System.out.println(o);
		}
	}
	*/
}
