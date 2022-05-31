package com.san.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="empleado")
public class Empleado {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_empleado;
	@Column
	private String documento_tipo;
	@Column
	private int documento_numero;
	@Column
	private String nombres;
	@Column
	private String apellidos;
	@Column
	private int id_departamentos_fk;
	@Column
	private String direccion;
	@Column
	private String correo_electronico;
	@Column
	private int telefono;
	@Column
	private String fecha_hora_crea;
	@Column
	private String fecha_hora_modifica;

	public int getId_empleado() {
		return id_empleado;
	}

	public void setId_empleado(int id_empleado) {
		this.id_empleado = id_empleado;
	}

	public String getDocumento_tipo() {
		return documento_tipo;
	}

	public void setDocumento_tipo(String documento_tipo) {
		this.documento_tipo = documento_tipo;
	}

	public int getDocumento_numero() {
		return documento_numero;
	}

	public void setDocumento_numero(int documento_numero) {
		this.documento_numero = documento_numero;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getId_departamentos_fk() {
		return id_departamentos_fk;
	}

	public void setId_departamentos_fk(int id_departamentos_fk) {
		this.id_departamentos_fk = id_departamentos_fk;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreo_electronico() {
		return correo_electronico;
	}

	public void setCorreo_electronico(String correo_electronico) {
		this.correo_electronico = correo_electronico;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
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
		return "Empleado [id_empleado=" + id_empleado + ", documento_tipo=" + documento_tipo + ", documento_numero="
				+ documento_numero + ", nombres=" + nombres + ", apellidos=" + apellidos + ", id_departamentos_fk="
				+ id_departamentos_fk + ", direccion=" + direccion + ", correo_electronico=" + correo_electronico
				+ ", telefono=" + telefono + ", fecha_hora_crea=" + fecha_hora_crea + ", fecha_hora_modifica="
				+ fecha_hora_modifica + "]";
	}

}
