package com.example.trabajoJava.TrabajoJava.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.trabajoJava.TrabajoJava.models.entity.Libro;
import com.example.trabajoJava.TrabajoJava.models.service.ILibroService;

@Controller
@RequestMapping("/views/libros")
public class LibroController {
	
	@Autowired
	private ILibroService libroService;
	
	@GetMapping("/")
	public String listarLibros(Model model) {
		List<Libro> listadoLibros = libroService.listartodos();
		
		model.addAttribute("titulo", "lista de libros");
		model.addAttribute("libros", listadoLibros);
		return "/views/libros/listar";
	}

}
