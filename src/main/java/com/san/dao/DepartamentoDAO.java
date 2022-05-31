package com.san.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.san.modelo.Departamento;
import com.san.modelo.JPAUtil;

public class DepartamentoDAO {
	EntityManager entity = JPAUtil.getEntityManagerFactory().createEntityManager();

	// guardar departamento
	public void guardar(Departamento departamento) {
		entity.getTransaction().begin();
		entity.persist(departamento);
		entity.getTransaction().commit();
		//JPAUtil.shutdown();
	}

	// editar departamento
	public void editar(Departamento departamento) {
		entity.getTransaction().begin();
		entity.merge(departamento);
		entity.getTransaction().commit();
		//JPAUtil.shutdown();
	}

	// buscar departamento
	public Departamento buscar(int id_departamento) {
		Departamento d = new Departamento();
		d = entity.find(Departamento.class, id_departamento);
		//JPAUtil.shutdown();
		return d;
	}

	/// eliminar departamento
	public void eliminar(int id_departamento) {
		Departamento d = new Departamento();
		d = entity.find(Departamento.class, id_departamento);
		entity.getTransaction().begin();
		entity.remove(d);
		entity.getTransaction().commit();
	}

	// obtener todos los departamentos
	public List<Departamento> obtenerDepartamento() {
		List<Departamento> listaDepartamento = new ArrayList<>();
		Query q = entity.createQuery("SELECT d FROM Departamento d");
		listaDepartamento = q.getResultList();
		return listaDepartamento;
	}
}
