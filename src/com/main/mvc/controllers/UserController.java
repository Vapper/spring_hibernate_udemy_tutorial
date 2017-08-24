package com.main.mvc.controllers;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.main.mvc.beans.User;

@Controller
public class UserController {
	
	@Value("#{accountTypes}") 
	private Map<String, String> accountTypes;
	
	@Value("#{prefLangOptions}")
	private Map<String, String> prefLangOptions;
	
	@Value("#{'${extentions.list}'.split(';')}")
	private String[] extentionsList;
	
	@RequestMapping(value="/addUser", method = RequestMethod.GET)
	public String addUser(Model model){
		model.addAttribute("newUser", new User());
		model.addAttribute("accountTypes",accountTypes);
		model.addAttribute("prefLangOptions",prefLangOptions);
		model.addAttribute("extentionsList",extentionsList);
		return "add-user";
	}
	
	@RequestMapping(value="/showUser", method = RequestMethod.POST)
	public String postNewUser(@Valid @ModelAttribute("newUser") User newUser,
			BindingResult bindingResult,
			Model model
			){
		
		System.out.println(bindingResult);
		
		if(bindingResult.hasErrors()){
			System.out.println("No last name");
			model.addAttribute("accountTypes",accountTypes);
			model.addAttribute("prefLangOptions",prefLangOptions);
			model.addAttribute("extentionsList",extentionsList);
			return "add-user";
		}else{
			model.addAttribute("user", newUser);
			return "show-user";
		}
	}
	
	@RequestMapping(value="/showUser", method = RequestMethod.GET)
	public String showUserProfile(){
		return "show-user";
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder){
		binder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
	}
}
