package com.backup.servidor.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="tb_informerai")
public class InformeRai implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cod_infor")
	private int codigo;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="fuentes")
	private String fuentes;
	
	@Column(name="contenido")
	private String contenido;
	

	//muchos a uno
		@ManyToOne
		@JoinColumn(name = "cod_planT")
		private PlanTrabajo planTrabajo;

		@ManyToOne
		@JoinColumn(name = "cod_usr")
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
