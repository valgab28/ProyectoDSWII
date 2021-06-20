package com.backup.servidor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backup.servidor.entity.InformeRai;
import com.backup.servidor.repository.InformeRaiDAO;

@Service
public class InformeRaiService {
	
	@Autowired
	private InformeRaiDAO dao;
	
	
	public List<InformeRai> listar(){
		return dao.findAll();
	}

	
	public void registrar(InformeRai bean) {
		dao.save(bean);
	}
	
	
	public void eliminar(int cod) {
		dao.deleteById(cod);
	}
	
	
}
