package com.ICA1.ict.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class Canteen {
@Id
private String id;
private String name;
private String location;

@OneToMany(mappedBy="canteens")
private List<DailyMenu>dailymenus;

@ManyToMany(mappedBy="canteens")
private List<Employee>employees;
}
