package com.backup.servidor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backup.servidor.entity.PlanTrabajo;

public interface PlanTrabajoDAO extends JpaRepository<PlanTrabajo, Integer> {
	
	

}
