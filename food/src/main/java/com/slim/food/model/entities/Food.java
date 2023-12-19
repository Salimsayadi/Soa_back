package com.slim.food.model.entities;

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import lombok.Data;


@Entity
@Data
public class Food {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idFood;
	@Column(name="nom_food")
	private String nomFood ;
	@Column(name="prix_food")
	private Double prixFood;
	@Column(name="date_preparation")
	private Date datePreparation;
	
	@ManyToOne
	private Choix choix;
	
//	@OneToOne
//	private image image;
	
	 @OneToMany (mappedBy = "food")
	 private List<image> images;
	 
	
}
