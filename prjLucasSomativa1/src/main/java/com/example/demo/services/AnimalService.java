
package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Animal;
import com.example.demo.repositories.AnimalRepository;

@Service
public class AnimalService {
	private final AnimalRepository animalRepository;
	
	@Autowired
	public AnimalService(AnimalRepository animalRepository) {
		this.animalRepository = animalRepository;
	}
	
	public Animal saveAnimal(Animal animal) {
		return animalRepository.save(animal);
	}
	
	public Animal getAnimalById(Long id) {
		return animalRepository.findById(id).orElse(null);
	}
	
	public List<Animal> getAllAnimais(){
		return animalRepository.findAll();
	}	
	
}
