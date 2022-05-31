package com.san.controlador;

//import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import com.san.dao.EmpleadoDAO;
import com.san.modelo.Empleado;

@ManagedBean(name = "empBean")
@RequestScoped
public class EmpleadoBean {
	public List<Empleado> obtenerEmpleados() {
		EmpleadoDAO empDAO = new EmpleadoDAO();

		/*
		 * List<Empleado> listaEmpleado = new ArrayList<>(); Empleado e1 = new
		 * Empleado(); e1.setId_empleado(1); e1.setDocumento_tipo("Cedula");
		 * e1.setDocumento_numero(103455);
		 * 
		 * 
		 * Empleado e2 = new Empleado(); e2.setId_empleado(2);
		 * e2.setDocumento_tipo("TI"); e2.setDocumento_numero(1203455);
		 * 
		 * listaEmpleado.add(e1); listaEmpleado.add(e2);
		 * 
		 * return listaEmpleado;
		 */

		return empDAO.obtenerEmpleados();
	}

	public String editar(int id_empleado) {
		EmpleadoDAO empDAO = new EmpleadoDAO();
		Empleado e = new Empleado();
		e = empDAO.buscar(id_empleado);
		System.out.println("******************************************");
		System.out.println(id_empleado);

		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("emp", e);
		return "/faces/empleado/empedit.xhtml";
	}

	public String actualizar(Empleado empleado) {
		EmpleadoDAO empDao = new EmpleadoDAO();
		empDao.editar(empleado);
		return "/faces/empleado/empleado.xhtml";
	}

	public String eliminar(int id_empleado) {
		EmpleadoDAO empDao = new EmpleadoDAO();
		empDao.eliminar(id_empleado);
		System.out.println("Empleado Eliminado");
		return "/faces/empleado/empleado.xhtml";
	}

	public String insertar() {
		Empleado e = new Empleado();
		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("emp", e);
		return "/faces/empleado/empinsert.xhtml";
	}

	public String añadir(Empleado empleado) {
		EmpleadoDAO empDAO = new EmpleadoDAO();
		empDAO.guardar(empleado);
		return "/faces/empleado/empleado.xhtml";
	}
}
