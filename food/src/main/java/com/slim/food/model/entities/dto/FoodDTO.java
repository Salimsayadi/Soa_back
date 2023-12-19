package com.slim.food.model.entities.dto;

import java.util.Date;

import java.util.List;

import com.slim.food.model.entities.Choix;
import com.slim.food.model.entities.image;

import lombok.AllArgsConstructor;
import lombok.Builder;

import lombok.NoArgsConstructor;



@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FoodDTO {
	private Long idFood;
	private String nomFood;
	private Double prixFood;
	private Date datePreparation;
	private Choix choix;

	private List<image> images;

	public Long getIdFood() {
		return idFood;
	}

	public void setIdFood(Long idFood) {
		this.idFood = idFood;
	}

	public String getNomFood() {
		return nomFood;
	}

	public void setNomFood(String nomFood) {
		this.nomFood = nomFood;
	}

	public Double getPrixFood() {
		return prixFood;
	}

	public void setPrixFood(Double prixFood) {
		this.prixFood = prixFood;
	}

	public Date getDatePreparation() {
		return datePreparation;
	}

	public void setDatePreparation(Date datePreparation) {
		this.datePreparation = datePreparation;
	}

	public Choix getChoix() {
		return choix;
	}

	public void setChoix(Choix choix) {
		this.choix = choix;
	}

	public List<image> getImages() {
		return images;
	}

	public void setImages(List<image> images) {
		this.images = images;
	}
	

}
