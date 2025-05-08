package com.ICA1.ict.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class OrderLine {
@Id
private String id;
private int quantity;

@ManyToOne
private Order order;

@ManyToOne
private MenuItem menuItem;
}
