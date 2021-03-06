package com.backup.servidor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.backup.servidor.entity.PlanTrabajo;
import com.backup.servidor.service.PlanTrabajoService;

@RestController
@RequestMapping("/plantrabajo")
public class PlanTrabajoController {

	@Autowired
	private PlanTrabajoService servicio;
	
	@GetMapping("/lista")
	@ResponseBody
	public List<PlanTrabajo> lista(){
		return servicio.listar();
	}
	
}
