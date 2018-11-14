
package com.javabycode.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.javabycode.springmvc.dao.EmpleadoDao;
import com.javabycode.springmvc.model.Empleado;

@Service("empleadoService")
@Transactional
public class EmpleadoServiceImpl implements EmpleadoService {

	@Autowired
	private EmpleadoDao dao;
	
	public Empleado findById(int id) {
		return dao.findById(id);
	}

	public void saveEmpleado(Empleado empleado) {
		dao.saveEmpleado(empleado);
	}
	
	public void updateEmpleado(Empleado empleado) {
		Empleado entity = dao.findById(empleado.getId());
		if(entity!=null){
			entity.setNombres(empleado.getNombres());
			entity.setApellidos(empleado.getApellidos());
			entity.setDireccion(empleado.getDireccion());
			entity.setCorreo(empleado.getCorreo());
			entity.setTelefono(empleado.getTelefono());
			entity.setDepartamento(empleado.getDepartamento());
			entity.setCargo(empleado.getCargo());
			//dao.saveOrUpdate(student);
		}
	}

	public void deleteEmpleadoByCode(String ssn) {
		dao.deleteEmpleadoByCode(ssn);
	}
	
	public List<Empleado> findAllEmpleados() {
		return dao.findAllEmpleados();
	}

	public Empleado findEmpleadoByCode(String ssn) {
		return dao.findEmpleadoByCode(ssn);
	}

	public boolean isEmpleadoCodeUnique(Integer id, String ssn) {
		Empleado empleado = findEmpleadoByCode(ssn);
		return ( empleado == null || ((id != null) && (empleado.getId() == id)));
	}
	
}
