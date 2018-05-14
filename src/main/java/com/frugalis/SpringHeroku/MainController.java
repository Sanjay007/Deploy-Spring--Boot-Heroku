package com.frugalis.SpringHeroku;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	
	@GetMapping("/")
    public String home() {
        return "Welcome to Spring.";
    }
}
