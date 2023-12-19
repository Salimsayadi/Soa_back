package com.slim.food.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.slim.food.model.entities.Auteur;
import com.slim.food.repos.AuteurRepository;

@RestController
@RequestMapping("/api/auteur")
public class AuteurRESTController {
	
	@Autowired
	AuteurRepository auteurRepository;
	@RequestMapping(method=RequestMethod.GET)
	public List<Auteur> getAllAuteur()
	{
		return auteurRepository.findAll();
	}
}
