package com.neiltolson.budget.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {
	@RequestMapping("/rest/example")
	public String home() {
		return "Hello World - example";
	}
}
