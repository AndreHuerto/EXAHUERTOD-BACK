package com.edu.EXAHUERTODBACK.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.EXAHUERTODBACK.entity.Libro;
import com.edu.EXAHUERTODBACK.service.LibroService;
@RestController
public class HomeController {
	@Autowired
	private LibroService libroservice;
	@GetMapping("/libros")
	
	public List<Libro> mensaje(){
		return libroservice.readAll();
	}

}
