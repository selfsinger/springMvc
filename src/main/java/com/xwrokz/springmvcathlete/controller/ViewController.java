package com.xwrokz.springmvcathlete.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.xwrokz.springmvcathlete.dto.AthleteDTO;
import com.xwrokz.springmvcathlete.service.AthleteService;

@Component
@RequestMapping("/")
public class ViewController {
	
	@Autowired
	private AthleteService athleteSevice;
	
	public ViewController() {
		System.out.println("created ViewController:"+this.getClass().getSimpleName());
	}
	
	@RequestMapping("/search")
	public String onSearch(@RequestParam String name,Model model) {
		System.out.println("Running on search method");
		System.out.println(name);
		AthleteDTO athDTO=athleteSevice.findByName(name);
		if(athDTO!=null) {
			 model.addAttribute("dt",athDTO);
		}else {
			
		
		 model.addAttribute("message","No Match Found For This Name...");
		}
		return "AthleteView";
	}

	
		
	
}
