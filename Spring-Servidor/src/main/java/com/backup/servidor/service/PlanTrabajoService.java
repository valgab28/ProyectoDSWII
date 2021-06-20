package com.backup.servidor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backup.servidor.entity.PlanTrabajo;
import com.backup.servidor.repository.PlanTrabajoDAO;

@Service
public class PlanTrabajoService {
	
	@Autowired
	private PlanTrabajoDAO dao;
	
	
	public List<PlanTrabajo> listar(){
		return dao.findAll();
	}

}
