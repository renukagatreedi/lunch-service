package com.lunch.manage.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lunch.manage.domain.Lunch;

@RestController
@RequestMapping("/api/v1/lunch")

public class lunchController {

	@GetMapping("/lunch")
	public Lunch lunch() {
		Lunch lunch = new Lunch();
		lunch.setName("Biriyani");
		lunch.setItemName("dum");
		lunch.setItems(5);
		return lunch;
	}

}
