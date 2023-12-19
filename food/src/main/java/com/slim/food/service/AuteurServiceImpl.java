package com.slim.food.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import com.slim.food.model.entities.Auteur;
import com.slim.food.repos.AuteurRepository;


@Service
public class AuteurServiceImpl implements AuteurService {
	@Autowired
	AuteurRepository auteurRepository;

	@Override
	public List<Auteur> getAllAuteur() {
		return auteurRepository.findAll();
	}
	

}
