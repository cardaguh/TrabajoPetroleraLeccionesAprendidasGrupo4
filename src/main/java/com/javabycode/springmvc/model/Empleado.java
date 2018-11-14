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
@Table(name="empleado")
public class Empleado {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Size(min=3, max=50)
	@Column(name = "NOMBRES", nullable = false)
	private String nombres;
	
	@Size(min=3, max=50)
	@Column(name = "APELLIDOS", nullable = false)
	private String apellidos;
	
	@NotEmpty
	@Column(name = "DIRECCION", unique=true, nullable = false)
	private String direccion;
	
	@NotEmpty
	@Column(name = "CORREO", unique=true, nullable = false)
	private String correo;
	
	@NotEmpty
	@Column(name = "TELEFONO", unique=true, nullable = false)
	private String telefono;
	
	@NotEmpty
	@Column(name = "DEPARTAMENTO", unique=true, nullable = false)
	private String departamento;
	
	@NotEmpty
	@Column(name = "CARGO", unique=true, nullable = false)
	private String cargo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombres=" + nombres + ", apellidos="
				+ apellidos + ", direccion=" + direccion + ", correo=" + correo + ", telefono=" + telefono + ", departamento=" + departamento + ", cargo= " + cargo + "]";
	}

}
