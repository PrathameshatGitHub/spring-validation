package com.example.demo.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entities.logindata;

import jakarta.annotation.PostConstruct;
import jakarta.validation.Valid;




@Controller
public class mycontroller {
	
	 
    @Autowired
	@GetMapping(value="/about")
	public String  about() {
	
        
		
		 
		
		return "services";
		//about.html
		
	 }

// 	@GetMapping("/conditional")
// public String conditional(){


// 	System.out.println("Imside the handler");
// 	return "conditional";

// }
@GetMapping("/footer")
public String footer(){

 
	return "services";
}
// @ModelAttribute("model")
// @GetMapping("/about")
// public String newabout(){
	

// 	return "about";
// }

// }

@GetMapping("/log")
public String loginpage(Model model){
	model.addAttribute("logindata", new logindata());
System.out.println("opning form");
	return"login";
}

@PostMapping("/process")
public String checkdata(@Valid @ModelAttribute("logindata") logindata log,BindingResult result){
if(result.hasErrors())
{System.out.println("there ate eoor");
	System.out.println(result);
	return"login";
}
	System.out.println(log);
	return "check";
}
}