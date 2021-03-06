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
@Table(name="tb_unidadorganica")
public class UnidadOrganica implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_uniO")
	private int codigo;
	
	@Column(name = "nom_uniO")
	private String nombre;
	
	@Column(name = "ape_uniO")
	private String apellido;
	
	@Column(name="correo")
	private String correo;
	
	@Column(name="asunto")
	private String asunto;
	
	//de uno a muchos
		@JsonIgnore
		@OneToMany(mappedBy = "tb_unidadorganica")
		private List<InformeMultiple> listaInformeMultiple;

		@JsonIgnore
		@OneToMany(mappedBy = "tb_unidadorganica")
		private List<Memorando> listaMemorando;

		public int getCodigo() {
			return codigo;
		}

		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getApellido() {
			return apellido;
		}

		public void setApellido(String apellido) {
			this.apellido = apellido;
		}

		public String getCorreo() {
			return correo;
		}

		public void setCorreo(String correo) {
			this.correo = correo;
		}

		public String getAsunto() {
			return asunto;
		}

		public void setAsunto(String asunto) {
			this.asunto = asunto;
		}

		public List<InformeMultiple> getListaInformeMultiple() {
			return listaInformeMultiple;
		}

		public void setListaInformeMultiple(List<InformeMultiple> listaInformeMultiple) {
			this.listaInformeMultiple = listaInformeMultiple;
		}

		public List<Memorando> getListaMemorando() {
			return listaMemorando;
		}

		public void setListaMemorando(List<Memorando> listaMemorando) {
			this.listaMemorando = listaMemorando;
		}

		
		
	

}
