package com.agus.tiendapc.ModeloDTO;

import java.io.Serializable;

public class UsuarioDTOvo implements Serializable{
	private Integer cedula_usuario;
	private String email_correo;
	private String nombre_usuario;
	private String password;
	private String usuario;
	
	public Integer getCedula_usuario() {
		return cedula_usuario;
	}
	public void setCedula_usuario(Integer cedula_usuario) {
		this.cedula_usuario = cedula_usuario;
	}
	public String getEmail_correo() {
		return email_correo;
	}
	public void setEmail_correo(String email_correo) {
		this.email_correo = email_correo;
	}
	public String getNombre_usuario() {
		return nombre_usuario;
	}
	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
}
