package com.xwrokz.springmvcathlete.dto;


import lombok.Data;

@Data
public class AthleteDTO {
	
	private String name;
	private int age;
	private String country;
	private String  state;
	private String city;
	private String sports;
	//private LocalDate dob;
	//private String dob;
	
	public AthleteDTO() {
		System.out.println("Its a default cons of:".concat(this.getClass().getSimpleName()));
	}
	

}
