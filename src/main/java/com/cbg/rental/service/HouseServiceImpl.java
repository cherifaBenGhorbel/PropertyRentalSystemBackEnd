package com.cbg.rental.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cbg.rental.entities.House;
import com.cbg.rental.entities.Owner;
import com.cbg.rental.repos.HouseRepository;
import com.cbg.rental.repos.ImageRepository;

@Service
public class HouseServiceImpl implements HouseService {
	@Autowired
	HouseRepository houseRepository;

	@Autowired
	ImageRepository imageRepository;

	@Override
	public House saveHouse(House h) {
		return houseRepository.save(h);
	}

	@Override
	public House updateHouse(House h) {
		/*
		Long oldHousImageId = 
				this.getHouse(h.getIdHouse()).getImage().getIdImage();
		Long newHousImageId = h.getImage().getIdImage();

		if(oldHousImageId != newHousImageId) //if the image is modified
			imageRepository.deleteById(oldHousImageId);
*/

		return houseRepository.save(h);
	}

	@Override
	public void deleteHouse(House h) {
		houseRepository.delete(h);

	}

	@Override
	public void deleteHouseById(Long id) {
		houseRepository.deleteById(id);

	}

	@Override
	public House getHouse(Long id) {
		return houseRepository.findById(id).get();
	}

	@Override
	public List<House> getAllHouses() {
		return houseRepository.findAll();
	}

	@Override
	public List<House> findByAddress(String address) {
		return houseRepository.findByAddress(address);
	}

	@Override
	public List<House> findByAddressContains(String address) {
		return houseRepository.findByAddressContains(address);
	}

	@Override
	public List<House> findByRentPriceLessThanEqual(double rentPrice) {
		return houseRepository.findByRentPriceLessThanEqual(rentPrice);
	}

	@Override
	public List<House> findByStatus(String status) {
		return houseRepository.findByStatus(status);
	}

	@Override
	public List<House> findByOwner(Owner owner) {
		return houseRepository.findByOwner(owner);
	}

	@Override
	public List<House> findByOwnerIdOwner(Long id) {
		return houseRepository.findByOwnerIdOwner(id);
	}

	@Override
	public List<House> findByOrderByRentPriceAsc() {
		return houseRepository.findByOrderByRentPriceAsc();
	}
}
