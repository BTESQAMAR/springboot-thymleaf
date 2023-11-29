package com.SpringBootthymleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
	@GetMapping("/")
	public String getHome() {
		return "normal-user/home";
	}
	@GetMapping("/home")
	public String getHomePage() {
		return "normal-user/home";
	}
	
	@GetMapping("/about")
	public String getAboutPage() {
		return "normal-user/about";
	}
	
	@GetMapping("/services")
	public String getServicesPage() {
		return "normal-user/services";
	}
	@GetMapping("/gallary")
	public String getGallary() {
		return "normal-user/gallary";
	}
	
	@GetMapping("/contact")
	public String geContact() {
		return "normal-user/contact";
	}
	@GetMapping("/login")
	public String geLogin() {
		return "normal-user/login";
	}
	@GetMapping("/contact_us")
	public String getContactForm() {
		return "normal-user/contactForm";
	}
}
