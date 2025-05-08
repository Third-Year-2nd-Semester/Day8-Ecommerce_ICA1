package com.ICA1.ict.model;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Order {
@Id
private String id;
private Date orderDate;

@ManyToOne
private Student student;
@OneToMany(mappedBy="order")
private List<OrderLine>orderlines;
}
