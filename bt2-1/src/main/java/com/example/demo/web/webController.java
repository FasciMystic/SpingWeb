package com.example.demo.web;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


	

@RestController
	public class webController {
		@GetMapping("/")
		public String index() {
			return "卢东梅";
		}
}
	