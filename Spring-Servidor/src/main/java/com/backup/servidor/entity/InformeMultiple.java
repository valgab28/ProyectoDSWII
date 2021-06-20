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
@Table(name="tb_informemultiple")
public class InformeMultiple implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_infm")
	private int codigo;
	
	@Column(name = "de_infm")
	private String de;
	
	@Column(name = "pa_infm")
	private String para;
	
	@Column(name="fe_cre")
	private String creacion;
	
	@Column(name="fe_mod")
	private String modificacion;
	
	@Column(name="asunto")
	private String asunto;
	
	@Column(name="motivo")
	private String motivo;
	
	//muchos a uno
	@ManyToOne
	@JoinColumn(name = "cod_uniO")
	private UnidadOrganica unidadOrganica;

	@ManyToOne
	@JoinColumn(name = "cod_usr")
	private Usuario usuario;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDe() {
		return de;
	}

	public void setDe(String de) {
		this.de = de;
	}

	public String getPara() {
		return para;
	}

	public void setPara(String para) {
		this.para = para;
	}

	public String getCreacion() {
		return creacion;
	}

	public void setCreacion(String creacion) {
		this.creacion = creacion;
	}

	public String getModificacion() {
		return modificacion;
	}

	public void setModificacion(String modificacion) {
		this.modificacion = modificacion;
	}

	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public UnidadOrganica getUnidadOrganica() {
		return unidadOrganica;
	}

	public void setUnidadOrganica(UnidadOrganica unidadOrganica) {
		this.unidadOrganica = unidadOrganica;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


	
	

}
