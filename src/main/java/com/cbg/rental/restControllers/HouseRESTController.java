package com.cbg.rental.restControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cbg.rental.entities.House;
import com.cbg.rental.service.HouseService;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api")
@CrossOrigin
public class HouseRESTController {
	
	@Autowired
	HouseService houseService;
	
	
	@RequestMapping(path="all" ,method = RequestMethod.GET)
	public List<House> getAllHouses() {
		return houseService.getAllHouses();
	}
	
	@RequestMapping(value = "/getbyid/{id}", method = RequestMethod.GET)
	public House getHouseByIds(@PathVariable("id") Long id) {
		return houseService.getHouse(id);
	}
	
	@RequestMapping(value ="/addhouse",method = RequestMethod.POST)
	//@PostMapping("/addhouse")
	public House createHouse(@RequestBody House house) {
		return houseService.saveHouse(house);
	}
	
	@RequestMapping(value ="/updatehouse",method = RequestMethod.PUT)
	public House updateHouse(@RequestBody House house) {
		return houseService.updateHouse(house);
	}
	
	@RequestMapping(value = "/delhouse/{id}", method = RequestMethod.DELETE)
	public void deleteHouse(@PathVariable("id") Long id) {
		 houseService.deleteHouseById(id);
	}
	
	@RequestMapping(value = "/houseOwner/{id}", method = RequestMethod.GET)
	public List<House> getHouseByIdOwner(@PathVariable("id") Long id) {
		return houseService.findByOwnerIdOwner(id);
	}

	@RequestMapping(value="/house/{add}", method = RequestMethod.GET)
	public List<House> findByAddressHouseContains(@PathVariable("add") String address) {
		return houseService.findByAddressContains(address);
	}
	
}
