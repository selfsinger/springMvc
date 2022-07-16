package com.xwrokz.springmvcathlete.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table
@NamedQuery(name="byName",query="select details from AthleteDetails details where details.name=:detail")
public class AthleteDetails {
	@Column(name="ID")
	@Id
	private int id;
	
	@Column(name="ATHLETE_NAME")
	private String name;
	
	@Column(name="AGE")
	private int age;
	
	@Column(name="COUNTRY_NAME")
	private String country;
	
	@Column(name="CITY_NAME")
	private String city;
	
	@Column(name="SPORTS_NAME")
	private String sports;
	
	@Column(name="STATE")
	private String  state;

}
