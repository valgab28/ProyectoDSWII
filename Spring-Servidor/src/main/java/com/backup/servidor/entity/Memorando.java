package com.backup.servidor.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_memorando")
public class Memorando implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_memo")
	private int codigo;
	
	@Column(name = "des_memo")
	private String descripcion;
	
	//muchos a uno
	@ManyToOne
	@JoinColumn(name = "cod_uniO")
	private UnidadOrganica unidadOrganica;
	
	@ManyToOne
	@JoinColumn(name = "cod_planT")
	private PlanTrabajo planTrabajo;

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

	public UnidadOrganica getUnidadOrganica() {
		return unidadOrganica;
	}

	public void setUnidadOrganica(UnidadOrganica unidadOrganica) {
		this.unidadOrganica = unidadOrganica;
	}

	public PlanTrabajo getPlanTrabajo() {
		return planTrabajo;
	}

	public void setPlanTrabajo(PlanTrabajo planTrabajo) {
		this.planTrabajo = planTrabajo;
	}

	
}
