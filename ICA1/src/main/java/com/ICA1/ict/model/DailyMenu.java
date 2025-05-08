package com.ICA1.ict.model;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class DailyMenu {
@Id
private String id;
private Date date;

@ManyToOne
private Canteen canteens;

@OneToMany(mappedBy="dailymenu")
private List<MenuItem>menuitems;
}
