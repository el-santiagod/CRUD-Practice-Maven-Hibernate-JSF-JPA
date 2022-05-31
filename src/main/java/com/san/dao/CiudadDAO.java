package com.san.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.san.modelo.Ciudad;
import com.san.modelo.JPAUtil;

public class CiudadDAO {
	EntityManager entity = JPAUtil.getEntityManagerFactory().createEntityManager();

	// guardar ciudad
	public void guardar(Ciudad ciudad) {
		entity.getTransaction().begin();
		entity.persist(ciudad);
		entity.getTransaction().commit();
		//JPAUtil.shutdown();
	}

	// editar ciudad
	public void editar(Ciudad ciudad) {
		entity.getTransaction().begin();
		entity.merge(ciudad);
		entity.getTransaction().commit();
		//JPAUtil.shutdown();
	}

	// buscar ciudad
	public Ciudad buscar(int id) {
		Ciudad c = new Ciudad();
		c = entity.find(Ciudad.class, id);
		//JPAUtil.shutdown();
		return c;
	}

	/// eliminar ciudad
	public void eliminar(int id) {
		Ciudad c = new Ciudad();
		c = entity.find(Ciudad.class, id);
		entity.getTransaction().begin();
		entity.remove(c);
		entity.getTransaction().commit();
	}

	// obtener todos las ciudades
	public List<Ciudad> obtenerCiudades() {
		List<Ciudad> listaCiudades = new ArrayList<>();
		Query q = entity.createQuery("SELECT c FROM Ciudad c");
		listaCiudades = q.getResultList();
		return listaCiudades;
	}
}
