package com.learning.SpringPetClinicData.services;

import java.util.Set;

import com.learning.SpringPetClinicData.model.Pet;

public interface PetService {
	Pet findById(long id);
	
	Pet save(Pet owner);
	
	Set<Pet> findAll();
	
	Pet findByName(String name);
}
