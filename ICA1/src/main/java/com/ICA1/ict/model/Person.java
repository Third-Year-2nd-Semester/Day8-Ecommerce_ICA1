package com.ICA1.ict.model;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Person {
@Id
protected String id;
protected String name;
protected int age;
protected String gender;
}
