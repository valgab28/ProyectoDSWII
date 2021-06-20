package com.backup.servidor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.backup.servidor.entity.InformeRai;
import com.backup.servidor.service.InformeRaiService;

@RestController
@RequestMapping("/informerai")
public class InformeRaiController {

	@Autowired
	private InformeRaiService servicio;
	
	@GetMapping("/lista")
	@ResponseBody
	public List<InformeRai> lista(){
		return servicio.listar();
	}
	
	@PostMapping("/registrar")
	public void registrar(@RequestBody InformeRai bean) {
		servicio.registrar(bean);
	}
	
	@DeleteMapping("/eliminar/{codigo}")
	public void eliminar(@PathVariable("codigo") int cod) {
		servicio.eliminar(cod);
	}
	
}
