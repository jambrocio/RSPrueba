package com.prueba.apirest.bean;

import java.math.BigDecimal;

public class Usuario {
	
	BigDecimal codigoUsuario;
	String usuario;
	String datos;
	String cargo;
	
	public BigDecimal getCodigoUsuario() {
		return codigoUsuario;
	}
	public void setCodigoUsuario(BigDecimal codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getDatos() {
		return datos;
	}
	public void setDatos(String datos) {
		this.datos = datos;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
}
