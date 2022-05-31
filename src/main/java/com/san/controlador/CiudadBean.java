package com.san.controlador;

//import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import com.san.dao.CiudadDAO;
import com.san.modelo.Ciudad;
import com.san.modelo.Departamento;

@ManagedBean(name = "ciudadBean")
@RequestScoped
public class CiudadBean {
	
	public List<Ciudad> obtenerCiudades() {
		CiudadDAO ciudadDao = new CiudadDAO();

	
		 /*List<Ciudad> listaCiudad = new ArrayList<>();
		 Ciudad c1 = new Ciudad();
		 c1.setId(1); 
		 c1.setCodigo_ciudad("222");
		 c1.setNombre_ciudad("Largo");

		 
		 Ciudad c2 = new Ciudad();
		 c2.setId(2);
		 c2.setCodigo_ciudad("22");
		 c2.setNombre_ciudad("Largo1");

		 listaCiudad.add(c1);
		 listaCiudad.add(c2);
		 
		 return listaCiudad;*/
		 
		return ciudadDao.obtenerCiudades();
	}
	
	public String editar(int id) {
		CiudadDAO ciudadDao = new CiudadDAO();
		Ciudad c = new Ciudad();
		c = ciudadDao.buscar(id);
		System.out.println("******************************************");
		System.out.println(c);

		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("ciudad", c);
		return "/faces/editarciudad.xhtml";
	}
	
	public String actualizar(Ciudad ciudad) {
		CiudadDAO ciudadDao = new CiudadDAO();
		ciudadDao.editar(ciudad);
		return "/faces/index.xhtml";
	}
	
	public String eliminar(int id) {
		CiudadDAO clienteDao = new CiudadDAO();
		clienteDao.eliminar(id);
		System.out.println("Ciudad Eliminado");
		return "/faces/index.xhtml";
	}
	
	public String insertar () {
		Ciudad c = new Ciudad();
		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("ciudad", c);
		return "/faces/insertciudad.xhtml";
	}
	
	public String añadir (Ciudad ciudad) {
		CiudadDAO ciudadDao = new CiudadDAO();
		ciudadDao.guardar(ciudad);	
		return "/faces/index.xhtml";
	}
	
	
}
