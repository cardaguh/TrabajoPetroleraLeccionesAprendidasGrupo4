package com.javabycode.springmvc.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.javabycode.springmvc.model.Empleado;

@Repository("empleadoDao")
public class EmpleadoDaoImpl extends AbstractDao<Integer, Empleado> implements EmpleadoDao {

	public Empleado findById(int id) {
		return getByKey(id);
	}

	public void saveEmpleado(Empleado empleado) {
		persist(empleado);
	}
	
	public void saveOrUpdate(Empleado empleado){
		super.saveOrUpdate(empleado);
	}
	
	public void deleteEmpleadoByCode(String code) {
		Query query = getSession().createSQLQuery("delete from Empleado where code = :code");
		query.setString("code", code);
		query.executeUpdate();
	}

	@SuppressWarnings("unchecked")
	public List<Empleado> findAllEmpleados() {
		Criteria criteria = createEntityCriteria();
		return (List<Empleado>) criteria.list();
	}

	public Empleado findEmpleadoByCode(String code) {
		Criteria criteria = createEntityCriteria();
		criteria.add(Restrictions.eq("code", code));
		return (Empleado) criteria.uniqueResult();
	}
}
