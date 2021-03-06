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
@Table(name="tb_plantrabajo")
public class PlanTrabajo implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_planT")
	private int codigo;
	
	@Column(name = "area_planT")
	private String area;
	
	@Column(name = "resp_planT")
	private String responsable;
	
	@Column(name="fec_ini")
	private String inicio;
	
	@Column(name="fec_fin")
	private String fin;
	
	@Column(name="rec_planT")
	private String rec;
	
	@Column(name="incidencias")
	private String incidencias;
	
	//de uno a muchos
		@JsonIgnore
		@OneToMany(mappedBy = "tb_plantrabajo")
		private List<InformeRai> listaInformeRai;
		
		//de uno a muchos
		@JsonIgnore
		@OneToMany(mappedBy = "tb_plantrabajo")
		private List<Memorando> listaMemorando;

		public int getCodigo() {
			return codigo;
		}

		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}

		public String getArea() {
			return area;
		}

		public void setArea(String area) {
			this.area = area;
		}

		public String getResponsable() {
			return responsable;
		}

		public void setResponsable(String responsable) {
			this.responsable = responsable;
		}

		public String getInicio() {
			return inicio;
		}

		public void setInicio(String inicio) {
			this.inicio = inicio;
		}

		public String getFin() {
			return fin;
		}

		public void setFin(String fin) {
			this.fin = fin;
		}

		public String getRec() {
			return rec;
		}

		public void setRec(String rec) {
			this.rec = rec;
		}

		public String getIncidencias() {
			return incidencias;
		}

		public void setIncidencias(String incidencias) {
			this.incidencias = incidencias;
		}

		public List<InformeRai> getListaInformeRai() {
			return listaInformeRai;
		}

		public void setListaInformeRai(List<InformeRai> listaInformeRai) {
			this.listaInformeRai = listaInformeRai;
		}

		public List<Memorando> getListaMemorando() {
			return listaMemorando;
		}

		public void setListaMemorando(List<Memorando> listaMemorando) {
			this.listaMemorando = listaMemorando;
		}

	

}
