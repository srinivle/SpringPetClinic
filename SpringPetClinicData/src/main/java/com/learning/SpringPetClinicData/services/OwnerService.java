package com.learning.SpringPetClinicData.services;

import java.util.Set;

import com.learning.SpringPetClinicData.model.Owner;

public interface OwnerService {
	Owner findById(long id);
	
	Owner save(Owner owner);
	
	Set<Owner> findAll();
	
	Owner findByLastName(String lastName);
}
