package com.cbg.rental.restControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cbg.rental.entities.Owner;
import com.cbg.rental.repos.OwnerRepository;
import com.cbg.rental.service.OwnerService;

@RestController
@RequestMapping("/api/own")
@CrossOrigin("*")
public class OwnerRESTController {

	@Autowired
	OwnerRepository ownerRepository;
	
	@Autowired
	OwnerService ownerService;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Owner> getAllCategories()
	{
	return ownerRepository.findAll();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Owner getOwnerById(@PathVariable("id") Long id) {
		return ownerRepository.findById(id).get();
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Owner createOwner(@RequestBody Owner own) {
		return ownerService.saveOwner(own);
	}

	

	
}
