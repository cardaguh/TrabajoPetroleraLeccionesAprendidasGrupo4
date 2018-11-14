package com.javabycode.springmvc.service;

import java.util.List;

import com.javabycode.springmvc.model.Empleado;

public interface EmpleadoService {

	Empleado findById(int id);
	
	void saveEmpleado(Empleado empleado);
	
	void updateEmpleado(Empleado empleado);
	
	void deleteEmpleadoByCode(String code);

	List<Empleado> findAllEmpleados(); 
	
	Empleado findEmpleadoByCode(String code);

	boolean isEmpleadoCodeUnique(Integer id, String code);
	
}
