package com.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.demo.pojos.TextToJSON;

@Controller
public class HomeController {
	@ResponseBody
	@RequestMapping(path="/")
	public TextToJSON test1() {
		return new TextToJSON("index.html");
	}
	@RequestMapping(path="/1", produces = "aplication/json")
	public String test2() {
		return "{\"page\": \"index.html\"}";
		
	}

}
