package com.ICA1.ict.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Food {
@Id
private String id;
private String name;
private Double price;
private Double weight;

@OneToMany(mappedBy="food")
private List<MenuItem>menuitems;
}
