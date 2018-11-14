package com.javabycode.springmvc.dao;

import java.util.List;

import com.javabycode.springmvc.model.Empleado;

public interface EmpleadoDao {
	
	Empleado findById(int id);

	void saveEmpleado(Empleado empleado);
	
	public void saveOrUpdate(Empleado empleado);
	
	void deleteEmpleadoByCode(String ssn);
	
	List<Empleado> findAllEmpleados();

	Empleado findEmpleadoByCode(String ssn);
}
