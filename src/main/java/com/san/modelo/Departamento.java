package com.san.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="departamento")
public class Departamento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_departamento;
	@Column
	private int departamento_codigo;
	@Column
	private String departamento_nombre;
	@Column
	private String fecha_hora_crea;
	@Column
	private String fecha_hora_modifica;
	public int getId_departamento() {
		return id_departamento;
	}
	public void setId_departamento(int id_departamento) {
		this.id_departamento = id_departamento;
	}
	public int getDepartamento_codigo() {
		return departamento_codigo;
	}
	public void setDepartamento_codigo(int departamento_codigo) {
		this.departamento_codigo = departamento_codigo;
	}
	public String getDepartamento_nombre() {
		return departamento_nombre;
	}
	public void setDepartamento_nombre(String departamento_nombre) {
		this.departamento_nombre = departamento_nombre;
	}
	public String getFecha_hora_crea() {
		return fecha_hora_crea;
	}
	public void setFecha_hora_crea(String fecha_hora_crea) {
		this.fecha_hora_crea = fecha_hora_crea;
	}
	public String getFecha_hora_modifica() {
		return fecha_hora_modifica;
	}
	public void setFecha_hora_modifica(String fecha_hora_modifica) {
		this.fecha_hora_modifica = fecha_hora_modifica;
	}
	@Override
	public String toString() {
		return "Departamento [id_departamento=" + id_departamento + ", departamento_codigo=" + departamento_codigo
				+ ", departamento_nombre=" + departamento_nombre + ", fecha_hora_crea=" + fecha_hora_crea
				+ ", fecha_hora_modifica=" + fecha_hora_modifica + "]";
	}
	
	
}
