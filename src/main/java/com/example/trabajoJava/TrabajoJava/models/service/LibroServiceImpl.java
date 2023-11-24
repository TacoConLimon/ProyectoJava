package com.example.trabajoJava.TrabajoJava.models.service;

import java.util.List;
import java.util.Optional;
import com.example.trabajoJava.TrabajoJava.models.entity.Libro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.trabajoJava.TrabajoJava.models.repository.LibroRepository;


@Service
public class LibroServiceImpl implements ILibroService {
	
	@Autowired
	private LibroRepository libroRepository;
	

	@Override
	public void guardar(Libro libro) {
		libroRepository.save(libro);
	}

	@Override
	public Libro buscarPorId(int Id) {	
		return libroRepository.findById(Id).orElse(null);
	}

	@Override
	public void eliminar(int Id) {
		libroRepository.deleteById(Id);
	}

	@Override
	public List<Libro> listartodos() {
		return (List<Libro>) libroRepository.findAll();
	}

	
}