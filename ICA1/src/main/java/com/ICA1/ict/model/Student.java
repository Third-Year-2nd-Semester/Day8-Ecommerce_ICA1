package com.ICA1.ict.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Student extends Person {

	private String deree;
	
	@OneToMany(mappedBy="student")
	private List<Order>orders;
}
