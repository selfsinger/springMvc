package com.xwrokz.springmvcathlete.service;



import com.xwrokz.springmvcathlete.dto.AthleteDTO;

public interface AthleteService {
	
	boolean validateAndSave(AthleteDTO dto);
	AthleteDTO findByName(String name);

}
