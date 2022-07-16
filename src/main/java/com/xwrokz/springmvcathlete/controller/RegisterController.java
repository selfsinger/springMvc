package com.xwrokz.springmvcathlete.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xwrokz.springmvcathlete.dto.AthleteDTO;
import com.xwrokz.springmvcathlete.service.AthleteService;

@Component
@RequestMapping("/")
public class RegisterController {
	
	@Autowired
	private AthleteService service;
	
	public RegisterController() {
		System.out.println("creating RegisterController");
	}
	
	@RequestMapping("/register")
	public String onSave(AthleteDTO dto,Model model) {
		System.out.println("running on save method");
		boolean saved=this.service.validateAndSave(dto);
		if(saved) {
			//model.addAttribute("data is saved");
			System.out.println("inside save method");
			model.addAttribute("message", dto);
			System.out.println("Name:"+dto.getName()+"\n"+"age:"+(dto.getAge())+"\n"+"country:"+dto.getCountry()+"\n"
					+"state:"+dto.getState()+"\n"+"city:"+dto.getCity()+"\n"+"sports:"+dto.getSports());
			return "Athlete";
		}
		return "Athlete";
		
	}
	

}
