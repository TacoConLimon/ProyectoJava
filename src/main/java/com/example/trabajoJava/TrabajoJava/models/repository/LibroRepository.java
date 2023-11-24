package com.example.trabajoJava.TrabajoJava.models.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.example.trabajoJava.TrabajoJava.models.entity.Libro;

@Repository
public interface LibroRepository extends CrudRepository<Libro, Integer> {

}
