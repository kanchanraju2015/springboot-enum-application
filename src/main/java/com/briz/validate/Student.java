package com.briz.validate;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="student")
public class Student 
{
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
int id;
String name;
int age;


// check the getter and setter for enum data types too important 
@Enumerated(value=EnumType.ORDINAL)  // important for development 
private CityEnum city;


@Enumerated(value=EnumType.STRING)  // important for development 
private GenderEnum gender;

public int getId() {
	return id;
}
public GenderEnum getGender() {
	return gender;
}
public void setGender(GenderEnum gender) {
	this.gender = gender;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public CityEnum getCity() {
	return city;
}
public void setCity(CityEnum city) {
	this.city = city;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
}


