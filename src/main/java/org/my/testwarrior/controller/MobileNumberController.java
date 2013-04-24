package org.my.testwarrior.controller;

import java.io.IOException;

import org.my.testwarrior.Dao.CountryDao;
import org.my.testwarrior.Dao.MobileNumbersDao;
import org.my.testwarrior.Dao.StateDao;
import org.my.testwarrior.Domain.MobileNumbers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MobileNumberController {	
	private MobileNumbersDao mobilenumbersdao;
	private CountryDao countrydao;
	private StateDao statedao;
	
	@Autowired
	public MobileNumberController(MobileNumbersDao mobilenumbersdao,CountryDao countrydao,StateDao statedao) {
		this.mobilenumbersdao = mobilenumbersdao;
		this.countrydao = countrydao;
		this.statedao = statedao;		
	}
	
	@RequestMapping(value="/createnumber", method = RequestMethod.GET) 
	public String createMobileNumbersView(Model model) throws IOException {		
		MobileNumbers numbers = new MobileNumbers();
		model.addAttribute("numbers",numbers);		
		model.addAttribute("countries", countrydao.retrieveAllCountries());		
//		model.addAttribute("states", statedao.getAllstateNames());
//		model.addAttribute("cities", citydao.getAllCityNames());
//		model.addAttribute("areas", areadao.getAllAreaNames());
		return "createnumber";
	}
	
	@RequestMapping(value="/createnumber", method = RequestMethod.POST) 
	public String createSite(@ModelAttribute("numbers") MobileNumbers numbers,BindingResult bindingresult) {
		if(bindingresult.hasErrors()){
			return "createnumber";
		}else{			
			mobilenumbersdao.createMobileNumber(numbers);
			return "home";			
		}

	}
}
