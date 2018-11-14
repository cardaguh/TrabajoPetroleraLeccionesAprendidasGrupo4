package com.javabycode.springmvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Type;
import org.hibernate.validator.constraints.NotEmpty;
import org.joda.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="leccion")
public class LeccionAprendida {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Size(min=3, max=50)
	@Column(name = "NOMBRE", nullable = false)
	private String nombre;

	@NotEmpty
	@Column(name = "DESCRIPCION", unique=true, nullable = false)
	private String descripcion;
	
	@NotEmpty
	@Column(name = "DIRECCION", unique=true, nullable = false)
	private String direccion;
	
	@NotEmpty
	@Column(name = "Incidente", unique=true, nullable = false)
	private String incidente;
	
	@NotEmpty
	@Column(name = "ARCHIVO", unique=true, nullable = false)
	private String archivo;


	@Override
	public String toString() {
		return "LeccionAprendida [id=" + id + ", nombre=" + nombre + ", descripcion="
				+ descripcion + ", incidente=" + incidente + "]";
	}

}
