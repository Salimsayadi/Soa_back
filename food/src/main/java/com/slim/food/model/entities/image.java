package com.slim.food.model.entities;

import jakarta.persistence.Entity;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;

@Entity
@Builder

@NoArgsConstructor
@AllArgsConstructor
@Data
public class image {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long idImage ;
 @Column(name="name")
 private String name ;
 @Column(name="type")
 private String type ;
 @Column( name = "IMAGE" , length = 4048576 ) 
 @Lob
 private byte[] image; 
 
 @ManyToOne
 @JoinColumn (name="FOOD_ID")
 @JsonIgnore
 private Food food;
 
}
