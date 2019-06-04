package com.learning.SpringPetClinicData.model;

import java.io.Serializable;

public class BaseEntity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6318585350254387433L;
	private long id;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	
}
