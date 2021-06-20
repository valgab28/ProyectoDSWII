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
@Table(name="tb_usuario")
public class Usuario implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_usr")
	private int codigo;
	
	@Column(name = "nom_usr")
	private String nombre;
	
	@Column(name = "ape_usr")
	private String apellido;
	
	@Column(name="area")
	private String area;
	
	@Column(name="tel_usr")
	private String telefono;
	
	@Column(name="gen_usr")
	private String genero;
	
	@Column(name="dir_usr")
	private String direccion;
	
	@Column(name="ema_usr")
	private String correo;
	
	@Column(name="dni_usr")
	private String dni;
	
	@Column(name="login")
	private String login;
	
	@Column(name="pass")
	private String password;
	
	//de uno a muchos
		@JsonIgnore
		@OneToMany(mappedBy = "tb_usuario")
		private List<InformeMultiple> listaInformeMultiple;
		
		@JsonIgnore
		@OneToMany(mappedBy = "tb_usuario")
		private List<InformeRai> listaInformeRai;

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

		public String getArea() {
			return area;
		}

		public void setArea(String area) {
			this.area = area;
		}

		public String getTelefono() {
			return telefono;
		}

		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}

		public String getGenero() {
			return genero;
		}

		public void setGenero(String genero) {
			this.genero = genero;
		}

		public String getDireccion() {
			return direccion;
		}

		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}

		public String getCorreo() {
			return correo;
		}

		public void setCorreo(String correo) {
			this.correo = correo;
		}

		public String getDni() {
			return dni;
		}

		public void setDni(String dni) {
			this.dni = dni;
		}

		public String getLogin() {
			return login;
		}

		public void setLogin(String login) {
			this.login = login;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public List<InformeMultiple> getListaInformeMultiple() {
			return listaInformeMultiple;
		}

		public void setListaInformeMultiple(List<InformeMultiple> listaInformeMultiple) {
			this.listaInformeMultiple = listaInformeMultiple;
		}

		public List<InformeRai> getListaInformeRai() {
			return listaInformeRai;
		}

		public void setListaInformeRai(List<InformeRai> listaInformeRai) {
			this.listaInformeRai = listaInformeRai;
		}
		
		

}
