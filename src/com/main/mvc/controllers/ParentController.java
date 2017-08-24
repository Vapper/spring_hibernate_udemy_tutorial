package com.main.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/parent")
public class ParentController {
	
	@RequestMapping("")
	public String showPage(){
		return "redirect:/";
	}
	
	@RequestMapping(value="/form", method = RequestMethod.GET)
	public String showForm(){
		return "test-form2";
	}
	
	@RequestMapping(value="/outputWithModel", method = RequestMethod.GET)
	public String showFormDataWithModel(@RequestParam("textField2") String textField2, Model model){
		model.addAttribute("message", textField2.toLowerCase()+" !!!");
		return "output";
	}
	
	@RequestMapping(value="/output", method = RequestMethod.GET)
	public String showFormData2(){
		return "output";
	}
}
