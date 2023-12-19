package com.slim.food.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.slim.food.model.entities.image;

public interface ImageRepository extends JpaRepository<image , Long>  {

}
