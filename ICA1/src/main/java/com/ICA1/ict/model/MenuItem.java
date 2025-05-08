package com.ICA1.ict.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class MenuItem {
@Id
private String id;

@ManyToOne
private DailyMenu dailymenu;

@ManyToOne
private Food food;
}
