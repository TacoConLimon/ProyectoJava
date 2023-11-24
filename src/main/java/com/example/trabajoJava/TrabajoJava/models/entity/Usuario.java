package com.example.trabajoJava.TrabajoJava.models.entity;

import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

@Entity
@Table(name="Usuario")
public class Usuario implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idUsuario;
	private String primer_nombre;
	private String segundo_nombre;
	private String primer_apellido;
	private String segundo_apellido;
	private Date fecha_nacimiento;
	private int edad;
	
	

}
