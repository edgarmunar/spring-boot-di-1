package com.springboot.di.app.models.domine;

public class Producto {

	private String nombreP;
	private Integer precio;
	
	public Producto(String nombreP, Integer precio) {
		this.nombreP = nombreP;
		this.precio = precio;
	}

	public String getNombreP() {
		return nombreP;
	}

	public void setNombreP(String nombreP) {
		this.nombreP = nombreP;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}
}