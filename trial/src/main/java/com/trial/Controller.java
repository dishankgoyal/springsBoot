package com.trial;

import java.util.HashMap;
import java.util.Map;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@org.springframework.stereotype.Controller
public class Controller {

	@RequestMapping(value = "/in")
	public String index(Model model) {
		
		model.addAttribute("data", "my data");
		model.addAttribute("data1", "true");
		model.addAttribute("index","ind");
		return "index";
	}
	
	@RequestMapping(value="/save")
	public void save() {
		
	}

	
}
