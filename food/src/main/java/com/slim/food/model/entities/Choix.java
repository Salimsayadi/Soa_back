package com.slim.food.model.entities;


import java.util.List;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;




@Entity
@Data
public class Choix {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idChoix;
	@Column(name="nom_choix")
	private String nomChoix;
	@Column(name="carecteristique_choix")
	private String caracteristiqueChoix;
	
	@JsonIgnore
	@OneToMany (mappedBy = "choix")
	
	private List<Food> food;
	


	
}