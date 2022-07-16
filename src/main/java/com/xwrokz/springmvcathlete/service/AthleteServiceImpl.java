package com.xwrokz.springmvcathlete.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.xwrokz.springmvcathlete.dao.AthleteDAO;
import com.xwrokz.springmvcathlete.dto.AthleteDTO;

import com.xwrokz.springmvcathlete.entity.AthleteDetails;

@Component
public class AthleteServiceImpl implements AthleteService {

	@Autowired
	private AthleteDAO dao;

	@Override
	public boolean validateAndSave(AthleteDTO dto) {
		if (dto != null) {
			if (dto.getName() == null || dto.getName().length() < 3 || dto.getName().length() > 30) {
				System.out.println("name is invalid nd can be saved");
				return false;
			}
			if (dto.getAge() > 10 && dto.getAge() < 100) {
				System.out.println("age is valid nd can be saved");
			} else {
				System.out.println("age is invalid....");
				return false;
			}
			if (dto.getCity() == null) {
				System.out.println("city is valid nd can be saved");

				return false;
			}
			if (dto.getCountry() == null) {
				System.out.println("country is invalid nd can be saved");
				return false;
			}
			if (dto.getSports() == null) {
				System.out.println("sports is invalid nd can be saved");
				return false;
			}
			if (dto.getState() == null) {
				System.out.println("state is invalid nd can be saved");
				return false;
			}

			else {
				System.out.println("everything is valid:");
				AthleteDetails entity=new AthleteDetails();
                BeanUtils.copyProperties(dto, entity);
				dao.save(entity);
				return true;
			}

		}
		System.err.println("dto is nulll cant be added");
		return true;
	}

	@Override
	public AthleteDTO findByName(String name) {
		
		System.out.println("Running findByName in service");
		AthleteDTO athleteDTO=new AthleteDTO();
		try {
		AthleteDetails athleteDetails=this.dao.findByName(name);
		System.out.println("Athlete deatils:"+athleteDetails);
		BeanUtils.copyProperties(athleteDetails, athleteDTO);
		System.out.println("entity converted to dto:"+athleteDTO);
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
		return athleteDTO;
	}

}
