package com.drn.drn_mng.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.drn.drn_mng.dto.StatusDrn;
import com.drn.drn_mng.jpa.dao.statusDrone;
import com.drn.drn_mng.jpa.dao.statusRepository;
import com.drn.drn_mng.jpa.dao.StatusDrnList;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/sendStatus")
public class sendStatus {
	@Autowired //sprint instancia o objetivo
	private statusRepository strepo; 
	@PostMapping
	@Transactional
	public String sendStatus(@RequestBody @Valid StatusDrn sts) {
		strepo.save(new statusDrone(sts));
		return "Status recebido";
	}
	
	@GetMapping
	//@Transactional
	public List<StatusDrnList> getDrStatus() {
	//public List<StatusDrnList> getDrStatus() {
		//strepo.findAll().stream().map(StatusDrnList::new);
		strepo.findAll();
		return null;//strepo.findAll().stream().map(StatusDrnList::new).toList();
	}
}
