package com.cbg.rental.entities;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class House {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idHouse;

    private String address;
    private double rentPrice;
    private String status; 

    @ManyToOne
    private Owner owner;
    
    /*
     * @OneToOne
     * private Image image;
    */
    
    @OneToMany (mappedBy = "house")
    private List<Image> images;
    
    
}
