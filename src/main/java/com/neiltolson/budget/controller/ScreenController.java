package com.neiltolson.budget.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ScreenController {

	@RequestMapping("/screen/{name}")
	public String getScreen(@PathVariable String name) {
		return "screen-" + name;
	}
}
