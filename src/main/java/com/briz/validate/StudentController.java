package com.briz.validate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@Validated
@RestController
public class StudentController 
{
@Autowired
StudentRepository srepo;
@RequestMapping("/test")
public String test()
{
	return "this is test only";
}
@RequestMapping("/testenum")
public String testing(@Valid PathVariable city)
{
	Student s=new Student();
	s.setAge(45);
	s.setCity(CityEnum.JAMSHEDPUR);
	s.setName("abha singh");
	s.setGender(GenderEnum.Male); // note this setting for enum data 
	srepo.save(s);
	return "this is enum test only";
}
}
