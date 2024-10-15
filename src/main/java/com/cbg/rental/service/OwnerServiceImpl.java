package com.cbg.rental.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cbg.rental.entities.Owner;
import com.cbg.rental.repos.OwnerRepository;

@Service
public class OwnerServiceImpl implements OwnerService{
	
	@Autowired
	OwnerRepository ownerRepository;
	

	@Override
	public Owner saveOwner(Owner o) {
		return ownerRepository.save(o);
	}

	@Override
	public Owner updateOwner(Owner o) {
		return ownerRepository.save(o);
	}

	@Override
	public void deleteOwner(Owner o) {
		ownerRepository.delete(o);
		
	}

	@Override
	public void deleteOwnerById(Long id) {
		ownerRepository.deleteById(id);
		
	}

	@Override
	public Owner getOwner(Long id) {
		return ownerRepository.findById(id).get();
	}

	@Override
	public List<Owner> getAllOwners() {
		return ownerRepository.findAll();
	}
	

}
