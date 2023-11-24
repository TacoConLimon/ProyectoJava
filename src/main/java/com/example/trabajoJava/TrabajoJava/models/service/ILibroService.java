package com.example.trabajoJava.TrabajoJava.models.service;

import java.util.List;
import com.example.trabajoJava.TrabajoJava.models.entity.Libro;


public interface ILibroService {
	List<Libro> listartodos();
	public void guardar(Libro libro);
	public Libro buscarPorId(int Id);
	public void eliminar(int Id);
	
}
