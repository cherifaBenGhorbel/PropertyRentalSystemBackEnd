package com.cbg.rental.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cbg.rental.entities.Image;

public interface ImageRepository extends JpaRepository<Image, Long> {

}
