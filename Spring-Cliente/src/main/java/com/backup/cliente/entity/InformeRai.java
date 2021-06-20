package com.backup.cliente.entity;

public class InformeRai {
	
	private int codigo;
	
	private String descripcion;
	
	private String fuentes;
	
	private String contenido;
	
	
	private PlanTrabajo planTrabajo;
	
	private Usuario usuario;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getFuentes() {
		return fuentes;
	}

	public void setFuentes(String fuentes) {
		this.fuentes = fuentes;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public PlanTrabajo getPlanTrabajo() {
		return planTrabajo;
	}

	public void setPlanTrabajo(PlanTrabajo planTrabajo) {
		this.planTrabajo = planTrabajo;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


	

}
