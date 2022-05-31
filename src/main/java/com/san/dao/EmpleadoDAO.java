package com.san.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.san.modelo.Empleado;
import com.san.modelo.JPAUtil;

public class EmpleadoDAO {
	EntityManager entity = JPAUtil.getEntityManagerFactory().createEntityManager();

	// guardar Empleado
	public void guardar(Empleado empleado) {
		entity.getTransaction().begin();
		entity.persist(empleado);
		entity.getTransaction().commit();
		//JPAUtil.shutdown();
	}

	// editar Empleado
	public void editar(Empleado empleado) {
		entity.getTransaction().begin();
		entity.merge(empleado);
		entity.getTransaction().commit();
		//JPAUtil.shutdown();
	}

	// buscar Empleado
	public Empleado buscar(int id_empleado) {
		Empleado e = new Empleado();
		e = entity.find(Empleado.class, id_empleado);
		//JPAUtil.shutdown();
		return e;
	}

	/// eliminar Empleado
	public void eliminar(int id_empleado) {
		Empleado e = new Empleado();
		e = entity.find(Empleado.class,id_empleado);
		entity.getTransaction().begin();
		entity.remove(e);
		entity.getTransaction().commit();
	}

	// obtener todos los empleados
	public List<Empleado> obtenerEmpleados() {
		List<Empleado> listaEmpleados = new ArrayList<>();
		Query q = entity.createQuery("SELECT e FROM Empleado e");
		listaEmpleados = q.getResultList();
		return listaEmpleados;
	}
}
