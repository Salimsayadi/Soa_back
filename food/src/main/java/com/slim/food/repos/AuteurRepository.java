package com.slim.food.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.slim.food.model.entities.Auteur;

@RepositoryRestResource(path ="auteur")
public interface AuteurRepository extends JpaRepository <Auteur,Long> {

}
