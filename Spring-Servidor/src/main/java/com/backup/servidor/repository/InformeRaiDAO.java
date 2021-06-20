package com.backup.servidor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backup.servidor.entity.InformeRai;

public interface InformeRaiDAO extends JpaRepository<InformeRai, Integer> {
	

}
