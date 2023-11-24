package com.example.trabajoJava.TrabajoJava.models.entity;
import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

@Entity
@Table(name="libro")
public class Libro implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idLibro;
	private String titulo;
	private String Autor;
	private String idioma;
	private String genero;
	private String editorial;
	
	@ManyToOne
	@JoinColumn(name="idUsuario")
	private Usuario usuario;
	
	
	public int getId() {
		return idLibro;
	}
	public void setId(int id) {
		idLibro = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return Autor;
	}
	public void setAutor(String autor) {
		Autor = autor;
	}
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	@Override
	public String toString() {
		return "Libro [idLibro=" + idLibro + ", titulo=" + titulo + ", Autor=" + Autor + ", idioma=" + idioma
				+ ", genero=" + genero + ", editorial=" + editorial + ", usuario=" + usuario + "]";
	}
	

}
