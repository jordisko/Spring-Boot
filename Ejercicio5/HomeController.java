package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HomeController {
	@RequestMapping("/hola")
	public String hello() {
		return "hola.html";
	}
	@ResponseBody
	@RequestMapping("/")
	public String index() {
		return "index.html";
	}
	@RequestMapping("/hola2")
	public String hello2() {
		return "hola2.html";
	}
}
