package com.api.almoco.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.almoco.dto.PratoDTO;
import com.api.almoco.model.PratoModel;
import com.api.almoco.repository.PratoRepository;

@RestController
@RequestMapping("prato")
public class PratoController {
	
	@Autowired
	PratoRepository repository;
	
	@GetMapping("/listar")
	public List<PratoModel> listar(){
		return repository.findAll();
	}
	
	@PostMapping("/cadastrar")
	public void cadastrar(@RequestBody PratoDTO plate){
		PratoModel prato = new PratoModel(plate);
		repository.save(prato);
	}
	
	@PutMapping("/atualizar/{id}")
	public List<PratoModel> atualizar(@PathVariable Long id, @RequestBody PratoModel plate) {
	    repository.findById(id);
	    plate.setId(id);
	    repository.save(plate);
	    return repository.findAll();
	}
	
	@DeleteMapping("/deletar/{id}")
	public void deletar(@PathVariable Long id) {
		repository.deleteById(id);
	}
}
