package com.learning.SpringPetClinicData.services;

import java.util.Set;

import com.learning.SpringPetClinicData.model.Vet;

public interface VetService {
	Vet findById(long id);
	
	Vet save(Vet owner);
	
	Set<Vet> findAll();
	
	Vet findByLastName(String lastName);
}
