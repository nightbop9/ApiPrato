package com.api.almoco.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.almoco.model.PratoModel;

public interface PratoRepository extends JpaRepository <PratoModel,Long> {
	

}
