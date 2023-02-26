package com.drn.drn_mng.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;

//import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.drn.drn_mng.dto.StatusDrn;
import com.drn.drn_mng.jpa.dao.StatusDrnList;
import com.drn.drn_mng.jpa.dao.statusDrone;
import com.drn.drn_mng.jpa.dao.statusRepository;

import jakarta.transaction.Transactional;
//import com.drn.drn_mng.jpa.dao.StatusDrnList;
@RestController
@RequestMapping("/api/getStatus")
public class getStatus {
	@Autowired
	private statusRepository strepo; 
	
	@GetMapping
	@Transactional
	public Page<StatusDrnList> getDrStatus(@PageableDefault(size=5) Pageable pagina) {		
		return strepo.findAll(pagina).map(StatusDrnList::new);
	}
	//public List<statusDrone> getDrStatus() {		
	//	return strepo.findAll();//strepo.findAll().stream().map(StatusDrnList::new).toList();
	//}

}
