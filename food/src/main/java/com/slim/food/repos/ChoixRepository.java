package com.slim.food.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.slim.food.model.entities.Choix;

@RepositoryRestResource(path ="choix")
public interface ChoixRepository extends JpaRepository <Choix,Long> {

	
	
}
