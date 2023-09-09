package com.tka.hw.hw10.Abstraction;

public class AbstractSubclassEx3 extends AbstractclassEx3 {

	String city,name,gender,country;
	
	@Override
	void getCity(String city) {
		// TODO Auto-generated method stub
		
		this.city = city;;
	}

	@Override
	void getCountry(String country) {
		// TODO Auto-generated method stub
	this.country = country;	
	}

	@Override
	void getName(String name) {
		// TODO Auto-generated method stub
	this.name = name;	
	}

	@Override
	void getGender(String gender) {
		// TODO Auto-generated method stub
		this.gender = gender;
	}	
	
	void display()
	{
		System.out.println("Name >>"+name);
		System.out.println("City >>"+city);
		System.out.println("Country >>"+country);
		System.out.println("Gender >>"+gender);
	}
}