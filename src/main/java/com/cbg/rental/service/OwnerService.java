package com.cbg.rental.service;

import java.util.List;

import com.cbg.rental.entities.Owner;

public interface OwnerService {
	Owner saveOwner(Owner o);
	Owner updateOwner(Owner o);
	void deleteOwner(Owner o);
	void deleteOwnerById(Long id);
	Owner getOwner(Long id);
	List<Owner> getAllOwners();

}
