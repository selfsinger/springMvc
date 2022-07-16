package com.xwrokz.springmvcathlete.dao;



import com.xwrokz.springmvcathlete.entity.AthleteDetails;

public interface AthleteDAO {

	 boolean save(AthleteDetails entity);
	 public AthleteDetails findByName(String name);
}
